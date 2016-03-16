package dao.cargo;

import dao.generic.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by oleksii.khilkevych on 3/16/2016.
 */
@Document(collection = "cargo")
public class Cargo extends Entity{

    private CargoType cargoType;

    public CargoType getCargoType() {
        return cargoType;
    }

    public void setCargoType(CargoType cargoType) {
        this.cargoType = cargoType;
    }
}
