package p1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import p2.Methods;

@Getter
@Setter
@SuperBuilder

@ToString(callSuper = true)
public class Sedan extends Car implements Methods {
    public Sedan(double power, double speed, String brand, double fuelConsumption) {
        super(power, speed, brand, fuelConsumption);
    }

    @Override
    public void onCar() {

    }

    @Override
    public void onEngine() {

    }

    @Override
    public void goesCar() {

    }

    @Override
    public void offCar() {

    }

    @Override
    public void distance(Car car, double time) {

    }
}
