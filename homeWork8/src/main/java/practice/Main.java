package practice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p2.InformationMethods;
import p2.Methods;

@Getter
@Setter
@ToString(callSuper = true)
public class Main {
    public static void main(String[] args) {
//        Sedan sedan = new Sedan(80,"Sedan",12);
        Methods informationMethods = (Methods) new InformationMethods();
//        informationMethods.onCar();
//        informationMethods.distance(sedan,50);
//        informationMethods.fuelFillingColumn();


    }
}
