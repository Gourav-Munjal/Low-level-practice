package nullDesignPattern;

import java.util.Objects;

public class VehicleFactory {

    static Vehicle getVehicleObject(String obj) {
        if (Objects.equals(obj, "Car")) {
            return new Car();
        }

        return new NULL();

    }
}
