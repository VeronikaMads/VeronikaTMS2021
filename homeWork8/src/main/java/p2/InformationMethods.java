package p2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import p1.Car;
import p1.Engine;
import p1.FuelBakCar;
import p4.InformationMethodsFuelBakCar;


import java.util.Scanner;

@Getter
@Setter

public class InformationMethods extends InformationMethodsFuelBakCar implements MethodsCar {
    private Car car;
    private Engine engine;

    public InformationMethods(Car car, FuelBakCar fuelBakCar, Engine engine) {
        super(fuelBakCar);
        this.car = car;
        this.engine = engine;
    }

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
        offCar();
    }


    @Override
    public void onEngine() {
        System.out.println("Двигатель включен" + "\n");
    }

    @Override
    public void goesCar() {
        checkFuelBak();
        System.out.println("Машина поехала!" + "\n");
    }

    @Override
    public void offCar() {
        System.out.println("Прежде чем выключить зажигание, давайте узнаем какое вы проехали расстояние:" + "\n");
        distance();
        System.out.println("Зажигаение выключено!");
    }

    @Override
    public void distance() {
        System.out.println("Введите время (в часах):");
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextInt();
        double way = car.getSpeedCar() * time;
        System.out.println("За время " + time + " часов, автомобиль " + car.getBrandCar() + " двигаясь со средней скоростью " + car.getSpeedCar() + " км/ч проедет " + way + " км ");
    }

    public void calculationFuel(double time) {
        double way = car.getSpeedCar() * time;
        double calculationFuel = (way * engine.getHowMuchFuelUsage() / 100);
        System.out.println("За время поездки в " + time + " часов, вы потраили " + calculationFuel + " литров топлива");
    }
}



