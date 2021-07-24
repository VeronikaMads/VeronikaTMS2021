package p2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.FuelBak;

import java.util.Scanner;

@Getter
@Setter
@ToString(callSuper = true)
public class InformationMethodsFuelBak implements MethodsFuelBak {

    @Override
    public void checkFuel(FuelBak fuelBak) {
        if (fuelBak.getHowMuchFuelingBak() > 10) {
            System.out.println("Топливо хватает! Можете ехать.");
        }
//        if (10 <= fuelBak.getHowMuchFuelingBak() && fuelBak.getHowMuchFuelingBak() > 4) {
//            System.out.println("Внимание! Топливо заканчивается. Рекомендую заправится!");
//            fuelFillingBak(fuelBak);
//        }
    }

    @Override
    public void fuelFillingBak(FuelBak fuelBak) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько литров хотите заправить?");
        double number2 = scanner.nextDouble();
        double result = fuelBak.getHowMuchFuelingBak() + number2;
        System.out.println("Спасибо! Вы запрвились на " + number2 + " литров. Итого топлива в баке " + result);
    }

}


