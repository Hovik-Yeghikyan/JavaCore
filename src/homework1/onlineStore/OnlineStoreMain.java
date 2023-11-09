package homework1.onlineStore;

import homework1.onlineStore.commands.Commands;
import homework1.onlineStore.exception.OutOfStockException;
import homework1.onlineStore.model.Order;
import homework1.onlineStore.model.Product;
import homework1.onlineStore.storage.OrderStorage;
import homework1.onlineStore.types.*;
import homework1.onlineStore.util.UUIDUtil;
import homework1.onlineStore.model.User;
import homework1.onlineStore.storage.ProductStorage;
import homework1.onlineStore.storage.UserStorage;

import java.util.Date;
import java.util.Scanner;

public class OnlineStoreMain implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductStorage productStorage = new ProductStorage();
    private static UserStorage userStorage = new UserStorage();
    private static OrderStorage orderStorage = new OrderStorage();
    public static User currentUser = null;

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Commands.printLoginCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT: {
                    isRun = false;
                    break;
                }
                case LOGIN: {
                    loginUserAdmin();
                    break;
                }
                case REGISTER: {
                    registerUsers();
                    break;
                }
                default: {
                    System.out.println("WRONG COMMAND!!!");
                }
            }
        }

    }


    private static void userMenu() {

        boolean isRun = true;
        while (isRun) {
            Commands.printUserCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT: {
                    isRun = false;
                    currentUser = null;
                    break;
                }
                case PRINT_ALL_PRODUCTS: {
                    productStorage.printProducts();
                    break;
                }
                case BUY_PRODUCT: {
                    byProduct();
                    break;
                }
                case PRINT_MY_ORDERS: {
                    orderStorage.printMyOrders(currentUser);
                    break;
                }
                case CANCEL_ORDER_BY_ID: {
                    cancelOrderById();
                    break;
                }
                default: {
                    System.out.println("WRONG COMMAND! TRY AGAIN!");
                    break;
                }
            }
        }
    }


    private static void adminMenu() {

        boolean isRun = true;
        while (isRun) {
            Commands.printAdminCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case LOGOUT: {
                    isRun = false;
                    break;
                }
                case ADD_PRODUCT: {
                    addProduct();
                    break;
                }
                case REMOVE_PRODUCT_BY_ID: {
                    removeProductByID();
                    break;
                }
                case PRINT_PRODUCTS: {
                    productStorage.printProducts();
                    break;
                }
                case PRINT_USERS: {
                    userStorage.printOnlyUsers();
                    break;
                }
                case PRINT_ORDERS: {
                    orderStorage.printAllOrders();
                    break;
                }
                case CHANGE_ORDER_STATUS: {
                    changeOrderStatus();
                    break;
                }
                default: {
                    System.out.println("WRONG COMMAND! TRY AGAIN!");
                    break;
                }
            }
        }
    }

    private static void changeOrderStatus() {
        orderStorage.printAllOrders();
        System.out.println("Please input order id you want to change");
        String orderId = scanner.nextLine();
        Order order = orderStorage.getOrderByID(orderId);
        if (order == null) {
            System.out.println("Icorrect ID!!! Try again!");
            return;
        }
        System.out.println("Please input order status NEW, DELIVERED or CANCELED");
        String orderstatus = scanner.nextLine().toUpperCase();
        OrderStatus orderStatus1 = orderStorage.getOrderStatusType(orderstatus);
        if (orderStatus1 == null) {
            System.out.println("You must input only NEW, DELIVERED or CANCELED");
            return;
        }
        if (orderStatus1 == OrderStatus.CANCELED) {
            order.setOrderStatus(orderStatus1);
            System.out.println("Order status changed as CANCELED");
            return;
        }
        if (orderStatus1 == OrderStatus.NEW) {
            order.setOrderStatus(orderStatus1);
            System.out.println("Order status changed as NEW");
            return;
        }
        if (orderStatus1 == OrderStatus.DELIVERED) {
            order.setOrderStatus(orderStatus1);
            String product = order.getProduct();
            Product product1 = productStorage.getProductById(product);
            int temp = product1.getStockQty() - order.getQty();
            product1.setStockQty(temp);

            System.out.println("Product DELIVERED");
        }

    }


    private static void cancelOrderById() {
        orderStorage.printMyOrders(currentUser);
        System.out.println("Please input orderId  you want to CANCEL");
        String orderID = scanner.nextLine();
        Order order = orderStorage.getOrderByID(orderID);
        if (order == null) {
            System.out.println("Incorrect order ID. Try again!!!");
            return;
        }
        order.setOrderStatus(OrderStatus.CANCELED);
        System.out.println("Order  is cancelled!");
    }


    private static void byProduct() {
        String id = UUIDUtil.generateUUID();
        productStorage.printProducts();
        System.out.println("Please input product id you want to BUY");
        String productId = scanner.nextLine();
        Product product = productStorage.getProductById(productId);
        if (product == null) {
            System.out.println("Product not found.Input correct product ID!!!");
            return;
        }
        try {
            System.out.println("Please input qty");
            int qty = Integer.parseInt(scanner.nextLine());
            if (qty <= 0) {
                System.out.println("Incorrect QTY!!!");
                return;
            }
                productStorage.getQty(productId, qty);
                System.out.println("Please input the payment method CARD, CASH OR PAYPAL");
                String type = scanner.nextLine().toUpperCase();
                PaymentMethod type1 = orderStorage.getOrderPayType(type);
                if (type1 == null) {
                    System.out.println("You must input only CARD, CASH OR PAYPAL!!!");
                    return;
                }
                double price = productStorage.getPrice(productId);
                price = price * qty;

                System.out.println("do you want to buy this product in such " + qty +
                        " and at such a " + price + " ?");
                System.out.println("Input YES for confirm, input NO for CANCEL");
                String answerType = scanner.nextLine().toUpperCase();
                Answers answerType1 = orderStorage.getAnswerType(answerType);
                if (answerType1 == null) {
                    System.out.println("You must input only YES OR NO!!!");
                    return;
                }
                if (answerType1 == Answers.YES) {
                    //User user = new User();
                    Date date = new Date();
                    Order order = new Order(id, currentUser, productId, date, price, OrderStatus.NEW, qty, type1);
                   // order.setUser(currentUser);
                    orderStorage.add(order);
                    System.out.println(order);
                }
                if (answerType1 == Answers.NO) {
                    System.out.println("YOUR ORDER IS NOT REGISTERED!");
                }
        } catch (OutOfStockException e) {
                System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Incorrect format for Qty!!!");
        }
    }

    private static void loginUserAdmin() {
        System.out.println("Please input your email");
        String email = scanner.nextLine();
        System.out.println("Please input your password");
        String password = scanner.nextLine();
        User user = userStorage.getUserEmailAndPassword(email, password);
        if (user == null) {
            System.out.println("Invalid email or password. Try again!");
            return;
        }
        if (user.getType() == UserType.ADMIN) {
            System.out.println("YOU LOGGED IN AS A ADMINISTRATOR");
            currentUser = user;
            adminMenu();
        }
        if (user.getType() == UserType.USER) {
            System.out.println("YOU LOGGED IN AS A USER");
            currentUser = user;
            userMenu();
        }
    }

    private static void removeProductByID() {
        productStorage.printProducts();
        System.out.println("Please input product ID for DELETE");
        String id = scanner.nextLine();
        productStorage.deleteProductByID(id);
    }

    private static void addProduct() {
        System.out.println("Please input product id");
        String id = scanner.nextLine();
        Product productId = productStorage.getProductById(id);
        if (productId != null) {
            System.out.println("Product with this ID is already exists!");
            return;
        }
        System.out.println("Please input product name");
        String name = scanner.nextLine();
        System.out.println("Please input product description");
        String description = scanner.nextLine();

        try {
            System.out.println("Please input product price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input product stockQty");
            int stockQty = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input product type ELECTRONICS, CLOTHING OR BOOKS");
            String type = scanner.nextLine().toUpperCase();
            ProductType type1 = productStorage.getProductType(type);
            if (type1 == null) {
                System.out.println("You must input only ELECTRONICS, CLOTHING OR BOOKS!!!");
                return;
            }
            Product product = new Product(id, name, description, price, stockQty, type1);
            productStorage.add(product);
            System.out.println("Product created!");
        } catch (NumberFormatException e) {
            System.out.println("Incorrect format for Price/StockQty!!!");
        }
    }

    private static void registerUsers() {
        String id = UUIDUtil.generateUUID();
        User userId = userStorage.getUserById(id);
        {
            if (userId != null) {
                System.out.println("This ID is already registered");
                return;
            }
        }
        System.out.println("Please input email");
        String email = scanner.nextLine();
        User user1 = userStorage.getUserEmail(email);
        if (user1 != null) {
            System.out.println("User is already registered!");
            return;
        }
        System.out.println("Please create password");
        String password = scanner.nextLine();

        System.out.println("Please input User name");
        String name = scanner.nextLine();
        System.out.println("Please input type: ADMIN OR USER");
        String type = scanner.nextLine().toUpperCase();
        UserType type1 = userStorage.getUserAndAdminType(type);
        if (type1 == null) {
            System.out.println("Wrong type!!! Input only ADMIN or USER");
            return;
        }
        User user = new User(id, name, email, password, type1);
        userStorage.add(user);
        System.out.println("Your account created as " + type1);
    }
}
