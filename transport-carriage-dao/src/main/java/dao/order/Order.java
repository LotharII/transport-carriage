package dao.order;

import dao.cargo.CargoType;
import dao.generic.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;

/**
 * Created by oleksii.khilkevych on 3/16/2016.
 */
@Document(collection = "order")
public class Order extends Entity{

    private CargoType cargoType;

    private String customerId;

    private OrderType orderType;

    private BigInteger price;

    private String carrierId;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public String getCarrierId () {
        return carrierId;
    }

    public void setCarrierId (String carrierId) {
        this.carrierId = carrierId;
    }

    public CargoType getCargoType () {
        return cargoType;
    }

    public void setCargoType (CargoType cargoType) {
        this.cargoType = cargoType;
    }
}
