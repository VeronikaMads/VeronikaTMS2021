package p1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p2.Methods;

@Getter
@Setter

@ToString(callSuper = true)
public class Sedan extends Car implements Methods {
    public Sedan(double speed, String brand, double fuelConsumption) {
        super(speed, brand, fuelConsumption);
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

    @Override
    public void checkFuel(FuelTank fuelTank) {

    }

    @Override
    public double fuelFillingColumn(FuelTank fuelTank) {
        return 0;
    }
}
