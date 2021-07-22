package p2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import p1.Car;

import java.util.Scanner;

@Getter
@SuperBuilder
@Setter
@ToString(callSuper = true)
public class InformationMethods implements Methods {

    @Override
    public void onCar() {
        boolean isCorrect = true;
        System.out.println("Внимание! Чтобы поехать, нужно включить двигатель! Вставьте ключ в зажигание и поверните его. ");
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
        System.out.println("Машина поехала!");
    }

    @Override
    public void offCar() {
        System.out.println("Выключено зажигание машины");
    }

    @Override
    public void onEngine() {
        System.out.println("Двигатель включен");
    }

    @Override
    public void distance(Car car, double time) {
       double distance = car.getSpeed()*time;
        System.out.println("За время ЧЧ,ММ " +time+ "автомобиль" +car.getBrand()+"\n"+ "двигаясь со средней скоростью "
                +car.getSpeed()+ "\n" + "проедет" +distance+ "км");
    }
}
