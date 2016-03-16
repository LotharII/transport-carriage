package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by oleksii.khilkevych on 3/16/2016.
 */
@Document(collection = "carrier")
public class Carrier {

    @Id
    private String carrierId;

    private CarrierType carrierType;

    private String name;

    private Integer yearsOfExpirience;

    private List<Order> orders;

    public String getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId;
    }

    public CarrierType getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(CarrierType carrierType) {
        this.carrierType = carrierType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearsOfExpirience() {
        return yearsOfExpirience;
    }

    public void setYearsOfExpirience(Integer yearsOfExpirience) {
        this.yearsOfExpirience = yearsOfExpirience;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
