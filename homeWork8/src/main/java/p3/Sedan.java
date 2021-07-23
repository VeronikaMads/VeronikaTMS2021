package p3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.Car;
import p1.FuelBak;
import p2.Methods;

@Getter
@Setter

@ToString(callSuper = true)
public class Sedan extends Car implements Methods {
    public Sedan(double speedCar, String brandCar) {
        super(speedCar, brandCar);
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
    public void checkFuel(FuelBak fuelTank) {

    }

    @Override
    public void fuelFillingColumn(FuelBak fuelTank) {

    }
}

