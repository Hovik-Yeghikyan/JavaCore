package homework1.onlineStore.storage;

import homework1.onlineStore.model.Order;
import homework1.onlineStore.types.Answers;
import homework1.onlineStore.types.PaymentMethod;

public class OrderStorage {

    private Order[] orders = new Order[10];
    private int size;

    public void add(Order product) {
        if (size == orders.length) {
            extend();
        }
        orders[size++] = product;
    }

    public void printAllOrders(){
        for (int i = 0; i < size; i++) {
            System.out.println(orders[i]);
        }
    }

    public PaymentMethod getOrderType(String type) {
        if (type.equals(PaymentMethod.CARD.name()) ||
                type.equals(PaymentMethod.CASH.name()) || type.equals(PaymentMethod.PAYPAL.name())) {
            return PaymentMethod.valueOf(type);
        }
        return null;
    }

    public Answers getAnswerType(String type) {
        if (type.equals(Answers.YES.name()) ||
                type.equals(Answers.NO.name()) ) {
            return Answers.valueOf(type);
        }
        return null;
    }

    private void extend() {

        Order[] temp = new Order[orders.length+ 10];
        System.arraycopy(orders, 0, temp, 0, orders.length);
        orders = temp;
    }
}
