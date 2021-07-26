package p4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import p1.FuelBakCar;

import java.util.Scanner;
@Getter
@Setter
@AllArgsConstructor
public class InformationMethodsFuelBakCar implements MethodsFuelBak {
    private FuelBakCar fuelBakCar;

    @Override
    public void checkFuelBak() { // метод проверяет хватает ли бензина?
        if (fuelBakCar.getHowMuchFuelingBak() > 10) {
            System.out.println("Топливо хватает! Можете ехать.");
        } noFuel();

    }
    // создаем метод для нехватки топлива в баке.
    @Override
    public void noFuel() {
        if (10 <= fuelBakCar.getHowMuchFuelingBak() && fuelBakCar.getHowMuchFuelingBak() > 4) {
            System.out.println("Внимание! Топливо заканчивается. Рекомендую заправится!");
            fuelFillingBak();
        }

    }


    @Override
    public void fuelFillingBak() { // метод который осуществляюет заправку и проверяет хватате ли места в баке.
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Сколько литров хотите заправить?");
            double number2 = scanner.nextDouble();
            double result = fuelBakCar.getHowMuchFuelingBak() + number2;
            if (result <= fuelBakCar.getMaxVolume()) {
                System.out.println("Спасибо! Вы запрвились на " + number2 + " литров. Итого топлива в баке " + result);
                break;
            } else {
                System.out.println("Ошибка! Нехватает места в баке. Заправьте меньше литров!");
            }
        }
    }
}

