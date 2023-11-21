package homework1.onlineStore.storage;

import homework1.onlineStore.exception.OutOfStockException;
import homework1.onlineStore.model.Product;
import homework1.onlineStore.model.User;
import homework1.onlineStore.types.ProductType;
import homework1.onlineStore.types.UserType;
import homework1.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class ProductStorage implements Serializable {

    private Set<Product> products = new HashSet<>();

    public void add(Product product) {
        products.add(product);
        StorageSerializeUtil.serializeProductStorage(this);
    }

    public void printProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public Product getProductById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public double getPrice(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product.getPrice();
            }
        }
        return 0;
    }

    public void deleteProductByID(String id) {
        if (products.removeIf(product -> product.getId().equals(id))) {
            System.out.println("Product Deleted!");
        }else {
            System.out.println("product not found");
        }

//        for (Product product : products) {  -> ConcurrentModificationException
//            if (product.getId().equals(id)){
//                products.remove(product);
//            }
//        }
    }

    public ProductType getProductType(String type) {
        if (type.equals(ProductType.ELECTRONICS.name()) ||
                type.equals(ProductType.CLOTHING.name()) || type.equals(ProductType.BOOKS.name())) {
            return ProductType.valueOf(type);
        }
        return null;
    }

    public int getQty(String id, int qty) throws OutOfStockException {
        for (Product product : products) {
            if (product.getId().equals(id)&&product.getStockQty() >= qty){
                return product.getStockQty();
            }
        }
        throw new OutOfStockException("You cant order product in this qty!!!");
    }

}
