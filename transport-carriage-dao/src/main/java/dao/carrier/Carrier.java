package dao.carrier;

import dao.generic.Entity;
import dao.order.Order;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by oleksii.khilkevych on 3/16/2016.
 */
@Document(collection = "carrier")
public class Carrier extends Entity{

    private CarrierType carrierType;

    private String name;

    private Integer yearsOfExpirience;

    private List<String> orderIds;

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

    public List<String> getOrderIds () {
        return orderIds;
    }

    public void setOrderIds (List<String> orderIds) {
        this.orderIds = orderIds;
    }
}
