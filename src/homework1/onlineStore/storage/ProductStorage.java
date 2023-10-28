package homework1.onlineStore.storage;

import homework1.onlineStore.model.Product;
import homework1.onlineStore.model.User;

public class ProductStorage {

    private Product[] products = new Product[10];
    private int size;

    public void add(Product product) {
        if (size == products.length) {
            extand();
        }
        products[size++] = product;
    }

    private void extand() {

        Product[] temp = new Product[products.length+ 10];
        System.arraycopy(products, 0, temp, 0, products.length);
        products = temp;
    }
}
