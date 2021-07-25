package com.home.metod;

import com.home.heir2.Cargo;
import com.home.heir2.Passenger;
import com.home.heir3.Civil;
import com.home.heir3.Military;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Scanner;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
public class Calculation {

    public void cargoWeightInfo(Cargo cargo) { // вызываем метод
        double loadCapacity = cargo.getLoadCapacity();// связывем с классом (откуда будем брать информацию о грузо-ти)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массу груза в кг, которую хотите загурзить в грузовик :");
        int weightHold = scanner.nextInt(); // присваиваем массу загрузки
        if (weightHold <= cargo.getLoadCapacity()) { // пишем логику
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше ");
        }
    }

    public void civilInfo(Civil civil) {
        int numbOfPassengers = civil.getNumbOfPassengers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пассажиров, которое вы хотите посадить в гражданский самолет:");
        int people = scanner.nextInt(); // присваиваем количество людей
        if (people <= civil.getNumbOfPassengers()) { // пишем логику
            System.out.println("Гражданкий самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше ");
        }

    }

    public void militaryCatapultInfo(Military military) {
        if (military.isEjectionSystem()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }

    }

    public void militaryRacketInfo(Military military) {
        int missile = military.getMissile();
        if (missile == 0) {
            System.out.println("Боеприпасы отсутствуют");
        } else {
            System.out.println("Ракета пошла…");
        }
    }


    public void passengerAllInfo(Passenger passenger, double time) {
        System.out.println("За время ЧЧ,ММ " + time + "автомобиль" + passenger.getBrand() + "\n" + "двигаясь с максимальной скоростью "
                + passenger.getSpeed() + "\n" + "проедет" + distance(passenger, time) + "км и израсходует" + calculationFuel(passenger, time) + "литров топлива");


    }

    private double distance(Passenger passenger, double time) { // считаем расстояние
        return passenger.getSpeed() * time;
    }

    private double calculationFuel(Passenger passenger, double time) { // считаем количесвто бензина
        return distance(passenger, time) * passenger.getFuelConsumption();
    }

}



