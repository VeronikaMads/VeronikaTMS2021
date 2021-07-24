package p4;

import p1.FuelBakCar;

import java.util.Scanner;

public class InformationMethodsFuelBakCar implements MethodsFuelBak {

    @Override
    public void checkFuelBak(FuelBakCar fuelBakCar) {
        if (fuelBakCar.getHowMuchFuelingBak() > 10) {
            System.out.println("Топливо хватает! Можете ехать.");
        }
//        if (10 <= fuelBakCar.getHowMuchFuelingBak() && fuelBakCar.getHowMuchFuelingBak() > 4) {
//            System.out.println("Внимание! Топливо заканчивается. Рекомендую заправится!");
//            fuelFillingBak(fuelBakCar);
        }

    @Override
    public void fuelFillingBak(FuelBakCar fuelBakCar) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько литров хотите заправить?");
        double number2 = scanner.nextDouble();
        double result = fuelBakCar.getHowMuchFuelingBak() + number2;
        System.out.println("Спасибо! Вы запрвились на " + number2 + " литров. Итого топлива в баке " + result);

    }
}
