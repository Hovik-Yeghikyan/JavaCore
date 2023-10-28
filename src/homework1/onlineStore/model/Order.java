package homework1.onlineStore.model;

import homework1.onlineStore.types.OrderStatus;
import homework1.onlineStore.types.PaymentMethod;

import java.util.Date;

public class Order {

    private int id;
    private User user;
    private Product product;
    private Date date;
    private double price;
    private OrderStatus orderStatus;
    private int qty;
    private PaymentMethod paymentMethod;

}
