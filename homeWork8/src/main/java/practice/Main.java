package practice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p2.InformationMethodsFuelBak;
import p2.MethodsFuelBak;
import p3.FuelBakSedan;
import p3.Sedan;

@Getter
@Setter
@ToString(callSuper = true)
public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(80,"Sedan");
        FuelBakSedan fuelBakSedan = new FuelBakSedan(5,55,"Алюминий");
//        MethodsCar informationMethods = (MethodsCar) new InformationMethods();
        MethodsFuelBak informationMethodsFuelBak =(MethodsFuelBak) new InformationMethodsFuelBak();
//        informationMethods.onCar();
//        informationMethods.distance(sedan,50);
        informationMethodsFuelBak.fuelFillingBak(fuelBakSedan);
        informationMethodsFuelBak.checkFuel(fuelBakSedan);


    }
}
