package view;

import dao.carrier.Carrier;
import dao.carrier.CarrierType;

import java.util.List;

/**
 * Created by oleksii.khilkevych on 3/16/2016.
 */
public class CarrierView extends View{

    private CarrierType carrierType;

    private String name;

    private Integer yearsOfExpirience;

    private List<String> orderIds;

    public CarrierView (Carrier carrier) {
        this.setId(carrier.getId());
        this.carrierType = carrier.getCarrierType();
        this.name = carrier.getName();
        this.yearsOfExpirience = carrier.getYearsOfExpirience();
        this.orderIds = carrier.getOrderIds();
    }

    public CarrierType getCarrierType () {
        return carrierType;
    }

    public void setCarrierType (CarrierType carrierType) {
        this.carrierType = carrierType;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Integer getYearsOfExpirience () {
        return yearsOfExpirience;
    }

    public void setYearsOfExpirience (Integer yearsOfExpirience) {
        this.yearsOfExpirience = yearsOfExpirience;
    }

    public List<String> getOrderIds () {
        return orderIds;
    }

    public void setOrderIds (List<String> orderIds) {
        this.orderIds = orderIds;
    }

    public Carrier convertViewToModel(){
        Carrier carrier = new Carrier();
        carrier.setId(this.id);
        carrier.setName(this.name);
        carrier.setCarrierType(this.carrierType);
        carrier.setOrderIds(this.orderIds);
        carrier.setYearsOfExpirience(this.yearsOfExpirience);
        return carrier;
    }
}
