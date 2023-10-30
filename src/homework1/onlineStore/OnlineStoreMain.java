package homework1.onlineStore;

import homework1.onlineStore.commands.Commands;
import homework1.onlineStore.model.Product;
import homework1.onlineStore.storage.OrderStorage;
import homework1.onlineStore.types.ProductType;
import homework1.onlineStore.util.UUIDUtil;
import homework1.onlineStore.model.User;
import homework1.onlineStore.storage.ProductStorage;
import homework1.onlineStore.storage.UserStorage;
import homework1.onlineStore.types.UserType;

import java.util.Scanner;

public class OnlineStoreMain implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductStorage productStorage = new ProductStorage();
    private static UserStorage userStorage = new UserStorage();
    private static OrderStorage orderStorage = new OrderStorage();

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
            adminMenu();
        }
        if (user.getType() == UserType.USER) {
            System.out.println("YOU LOGGED IN AS A USER");
            userMenu();
        }
    }

    private static void userMenu() {
        Commands.printUserCommands();
        String command = scanner.nextLine();
        boolean isRun = true;
        switch (command) {
            case LOGOUT: {
                isRun = false;
                break;
            }
            case PRINT_ALL_PRODUCTS: {
                break;
            }
            case BUY_PRODUCT: {
                break;
            }
            case PRINT_MY_ORDERS: {
                break;
            }
            case CANCEL_ORDER_BY_ID: {
                break;
            }
            default: {
                System.out.println("WRONG COMMAND! TRY AGAIN!");
                userMenu();
            }

        }
    }

    private static void adminMenu() {
        Commands.printAdminCommands();
        String commands = scanner.nextLine();
        boolean isRun = true;
        switch (commands) {
            case LOGOUT: {
                isRun = false;
                break;
            }
            case ADD_PRODUCT: {
                addProduct();
                adminMenu();
            }
            case REMOVE_PRODUCT_BY_ID: {
                break;
            }
            case PRINT_PRODUCTS: {
                break;
            }
            case PRINT_USERS: {
                break;
            }
            case PRINT_ORDERS: {
                break;
            }
            case CHANGE_ORDER_STATUS: {
                break;
            }
            default: {
                System.out.println("WRONG COMMAND! TRY AGAIN!");
                adminMenu();
                break;
            }
        }
    }

    private static void addProduct() {
        System.out.println("Please input product id");
        String id = scanner.nextLine();
        System.out.println("Please input product name");
        String name = scanner.nextLine();
        System.out.println("Please input product description");
        String description = scanner.nextLine();
        System.out.println("Please input product price");
       try {
           double price = Double.parseDouble(scanner.nextLine());
           System.out.println("Please input product stockQty");
           int stockQty = Integer.parseInt(scanner.nextLine());
           System.out.println("Please input product type ELECTRONICS, CLOTHING OR BOOKS");
           String type = scanner.nextLine();
           ProductType type1  = ProductType.valueOf(type.toUpperCase());
           Product product = new Product(id,name,description,price,stockQty,type1);
           productStorage.add(product);
           System.out.println(product);
           System.out.println("Product created!");
       }catch (NumberFormatException e){
           System.out.println("Incorrect format for Price/StockQty!!!");
       }
    }

    private static void registerUsers() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        User user1 = userStorage.getUserEmail(email);
        if (user1 != null) {
            System.out.println("User is already registered!");
            return;
        }
        System.out.println("Please create password");
        String password = scanner.nextLine();
        String id = UUIDUtil.generateUUID();
        System.out.println("Please input User name");
        String name = scanner.nextLine();
        System.out.println("Please input type: ADMIN OR USER");
        String type = scanner.nextLine();
        UserType type1 = UserType.valueOf(type.toUpperCase());
        User user = new User(id, name, email, password, type1);
        userStorage.add(user);
        System.out.println("User created");
        System.out.println(user);

    }
}
