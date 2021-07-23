package p2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.Car;
import p1.FuelBak;


import java.util.Scanner;

@Getter
@Setter
@ToString(callSuper = true)
public class InformationMethods implements Methods {

    @Override
    public void onCar() {
        boolean isCorrect = true;
        System.out.println("Внимание! Чтобы поехать, нужно включить двигатель! Вставьте ключ в зажигание и поверните его. " + "\n");
        while (true) {
            System.out.println("Если вы все поняли/сделали, введите цифру 1:");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number == 1) {
                onEngine(); // если водитель все сделал правильно, вызываем метод класса Двигатель.
                goesCar(); // соответсвенно машина приходит в движение
                break;
            } else {
                System.out.println("Вы что-то сделали не так! Машина не заведена. Попробуйте еще раз!");
            }

        }

    }

    @Override
    public void goesCar() {
        System.out.println("Машина поехала!" + "\n");
    }

    @Override
    public void offCar() {
        System.out.println("Зажигание выключено" + "\n");
    }

    @Override
    public void onEngine() {
        System.out.println("Двигатель включен" + "\n");
    }

    @Override
    public void distance(Car car, double time) {
        double distance = car.getSpeedCar() * time;
        System.out.println("За время " + time + " часов, автомобиль " + car.getBrandCar() + " двигаясь со средней скоростью " + car.getSpeedCar() + " км/ч проедет " + distance + " км ");
    }

    @Override
    public void checkFuel(FuelBak fuelTank) {
        if (fuelTank.getHowMuchFuelingBak() > 10) {
            System.out.println("Топливо хватает! Можете ехать.");
        }
        if (10 <= fuelTank.getHowMuchFuelingBak() && fuelTank.getHowMuchFuelingBak() > 4) {
            System.out.println("Внимание! Топливо заканчивается. Рекомендую заправится!");
        }

    }

    public void fuelFillingColumn(FuelBak fuelTank) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько литров хотите заправить?:");
        double number2 = scanner.nextDouble();
        double result = fuelTank.getHowMuchFuelingBak() + number2;
        System.out.println("Спасибо! Вы запрвились на " + number2 + " литров. Итого топлива в баке " + result);

    }
}

