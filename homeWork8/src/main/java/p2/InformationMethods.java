package p2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import p1.Car;

import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
public class InformationMethods implements MethodsCar {
private Car car;

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
    public void onEngine() {
        System.out.println("Двигатель включен" + "\n");
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
    public void distance(double time) {
        double distance = car.getSpeedCar() * time;
        System.out.println("За время " + time + " часов, автомобиль " + car.getBrandCar() + " двигаясь со средней скоростью " + car.getSpeedCar() + " км/ч проедет " + distance + " км ");
    }

}

