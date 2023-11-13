package homework1.onlineStore.storage;

import homework1.onlineStore.exception.OutOfStockException;
import homework1.onlineStore.model.Product;
import homework1.onlineStore.model.User;
import homework1.onlineStore.types.ProductType;
import homework1.onlineStore.types.UserType;
import homework1.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;

public class ProductStorage implements Serializable {

    private Product[] products = new Product[10];
    private int size;

    public void add(Product product) {
        if (size == products.length) {
            extend();
        }
        products[size++] = product;
        StorageSerializeUtil.serializeProductStorage(this);
    }

    public void printProducts() {
        for (int i = 0; i < size; i++) {
            System.out.println(products[i]);
        }
    }

    public Product getProductById(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id)) {
                return products[i];
            }
        }
        return null;
    }

    public double getPrice(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id)) {
                return products[i].getPrice();
            }
        }
        return 0;
    }

    public void deleteProductByID(String id) {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id)) {
                products[i] = products[i + 1];
                size--;
                System.out.println("Product Deleted!");
            }
        }
    }

    public ProductType getProductType(String type) {
        if (type.equals(ProductType.ELECTRONICS.name()) ||
                type.equals(ProductType.CLOTHING.name()) || type.equals(ProductType.BOOKS.name())) {
            return ProductType.valueOf(type);
        }
        return null;
    }

    public int getQty(String id, int qty) throws OutOfStockException {
        for (int i = 0; i < size; i++) {
            if (products[i].getId().equals(id) && products[i].getStockQty() >= qty) {
                return products[i].getStockQty();
            }
        }
        throw new OutOfStockException("You cant order product in this qty!!!");
    }


    private void extend() {

        Product[] temp = new Product[products.length + 10];
        System.arraycopy(products, 0, temp, 0, products.length);
        products = temp;
    }
}
