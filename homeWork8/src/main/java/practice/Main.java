package practice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.Car;
import p1.Engine;
import p1.FuelBakCar;
import p2.InformationMethods;
import p3.EngineSedan;
import p3.FuelBakSedan;
import p3.Sedan;
import p4.InformationMethodsFuelBakCar;


@Getter
@Setter
@ToString(callSuper = true)

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan(80, "Sedan");
        FuelBakCar fuelBakSedan = new FuelBakSedan(5, 55, "Алюминий");
        Engine engineSedan = new EngineSedan(815, 12);

        InformationMethods informationMethods = new InformationMethods(sedan, fuelBakSedan, engineSedan);
        InformationMethodsFuelBakCar informationMethodsFuelBakCar = new InformationMethodsFuelBakCar(fuelBakSedan);
        informationMethods.onCar();
        informationMethods.calculationFuel(6);
    }
}

