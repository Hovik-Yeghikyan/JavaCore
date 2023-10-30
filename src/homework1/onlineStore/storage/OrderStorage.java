package homework1.onlineStore.storage;

import homework1.onlineStore.model.Order;

public class OrderStorage {

    private Order[] orders = new Order[10];
    private int size;

    public void add(Order product) {
        if (size == orders.length) {
            extend();
        }
        orders[size++] = product;
    }

    private void extend() {

        Order[] temp = new Order[orders.length+ 10];
        System.arraycopy(orders, 0, temp, 0, orders.length);
        orders = temp;
    }
}
