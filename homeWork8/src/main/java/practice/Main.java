package practice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p2.InformationMethods;
import p2.MethodsCar;
import p3.FuelBakSedan;
import p3.Sedan;
import p4.InformationMethodsFuelBakCar;
import p4.MethodsFuelBak;

@Getter
@Setter
@ToString(callSuper = true)
public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(80, "Sedan");
        FuelBakSedan fuelBakSedan = new FuelBakSedan(5, 55, "Алюминий");
        MethodsCar info1 = new InformationMethods();
        MethodsFuelBak info2 = new InformationMethodsFuelBakCar();
        info2.checkFuelBak(fuelBakSedan);
    }
}

