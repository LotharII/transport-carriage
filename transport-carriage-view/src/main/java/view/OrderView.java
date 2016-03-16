package view;

import dao.cargo.CargoType;
import dao.order.Order;
import dao.order.OrderType;

import java.math.BigInteger;

/**
 * Created by oleksii.khilkevych on 3/16/2016.
 */
public class OrderView extends View{

    private CargoType cargoType;

    private String customerId;

    private OrderType orderType;

    private BigInteger price;

    private String carrierId;

    public OrderView (Order order) {
        this.cargoType = order.getCargoType();
        this.customerId = order.getCustomerId();
        this.orderType = order.getOrderType();
        this.price = order.getPrice();
        this.carrierId = order.getCarrierId();
    }

    public CargoType getCargoType () {
        return cargoType;
    }

    public void setCargoType (CargoType cargoType) {
        this.cargoType = cargoType;
    }

    public String getCustomerId () {
        return customerId;
    }

    public void setCustomerId (String customerId) {
        this.customerId = customerId;
    }

    public OrderType getOrderType () {
        return orderType;
    }

    public void setOrderType (OrderType orderType) {
        this.orderType = orderType;
    }

    public BigInteger getPrice () {
        return price;
    }

    public void setPrice (BigInteger price) {
        this.price = price;
    }

    public String getCarrierId () {
        return carrierId;
    }

    public void setCarrierId (String carrierId) {
        this.carrierId = carrierId;
    }

    public Order convertViewToModel(){
        Order order = new Order();
        order.setId(this.id);
        order.setCargoType(this.cargoType);
        order.setCarrierId(this.carrierId);
        order.setCustomerId(this.customerId);
        order.setOrderType(this.orderType);
        order.setPrice(this.price);
        return order;
    }
}
