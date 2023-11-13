package homework1.onlineStore.storage;

import homework1.onlineStore.model.Order;
import homework1.onlineStore.model.User;
import homework1.onlineStore.types.Answers;
import homework1.onlineStore.types.OrderStatus;
import homework1.onlineStore.types.PaymentMethod;
import homework1.onlineStore.types.UserType;
import homework1.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;

public class OrderStorage implements Serializable {

    private Order[] orders = new Order[10];
    private int size;

    public void add(Order product) {
        if (size == orders.length) {
            extend();
        }
        orders[size++] = product;
        StorageSerializeUtil.serializeOrderStorage(this);
    }

    public void printAllOrders() {
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }

    public void printMyOrders(User user) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getUser().equals(user)) {
                System.out.println(orders[i]);
            }

        }
    }


    public Order getOrderByID(String id) {
        for (int i = 0; i < size; i++) {
            if (orders[i].getId().equals(id)) {
                return orders[i];
            }
        }
        return null;
    }


    public PaymentMethod getOrderPayType(String type) {
        if (type.equals(PaymentMethod.CARD.name()) ||
                type.equals(PaymentMethod.CASH.name()) || type.equals(PaymentMethod.PAYPAL.name())) {
            return PaymentMethod.valueOf(type);
        }
        return null;
    }

    public OrderStatus getOrderStatusType(String type) {
        if (type.equals(OrderStatus.NEW.name()) ||
                type.equals(OrderStatus.DELIVERED.name()) || type.equals(OrderStatus.CANCELED.name())) {
            return OrderStatus.valueOf(type);
        }
        return null;
    }


    public Answers getAnswerType(String type) {
        if (type.equals(Answers.YES.name()) ||
                type.equals(Answers.NO.name())) {
            return Answers.valueOf(type);
        }
        return null;
    }


    private void extend() {

        Order[] temp = new Order[orders.length + 10];
        System.arraycopy(orders, 0, temp, 0, orders.length);
        orders = temp;
    }
}
