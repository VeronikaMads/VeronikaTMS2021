package com.home.metod;

import com.home.heir2.Cargo;
import com.home.heir2.Passenger;
import com.home.heir3.Civil;
import com.home.heir3.Military;
import com.home.parentClass.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Scanner;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public abstract class Calculation implements Method {

    @Override
    public void cargoWeightInfo(Transport transport) { // вызываем метод
        Method.super.cargoWeightInfo(transport);
        Cargo cargo = (Cargo) transport;
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

    @Override
    public void civilInfo(Transport transport) {
        Method.super.civilInfo(transport);
        Civil civil = (Civil) transport;
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

    @Override
    public void militaryCatapultInfo(Transport transport) {
        Method.super.militaryCatapultInfo(transport);
        Military military = (Military) transport;
        if (military.isEjectionSystem()){
            System.out.println("Катапультирование прошло успешно");
        }else {
            System.out.println("У вас нет такой системы");
        }

    }

    @Override
    public void militaryRacketInfo(Transport transport) {
        Method.super.militaryRacketInfo(transport);
        Military military = (Military) transport;
        int missile = military.getMissile();
        if (missile == 0) {
            System.out.println("Боеприпасы отсутствуют");
        } else {
            System.out.println("Ракета пошла…");
        }
    }

    @Override
    public void passengerDistanceInfo(Transport transport, double time,double distance) {
        Method.super.passengerDistanceInfo(transport, time,distance);
        Passenger passenger =(Passenger) transport;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время автомобиля в пути ЧЧ,ММ :");
        time = scanner.nextInt(); // присваиваем значение переменной время
        distance =passenger.getSpeed()*time;
        System.out.println("За время ЧЧ,ММ " +time+ "автомобиль" +passenger.getBrand()+"\n"+ "двигаясь с максимальной скоростью "
     +passenger.getSpeed()+ "\n" + "проедет" +distance+ "км и израсходует"  (xxx) литров топлива");
    }

    @Override
    public void passengerPetrolInfo(Transport transport, double petrol) {
        Method.super.passengerPetrolInfo(transport, petrol);
        Passenger passenger =(Passenger) transport;
        double time = passenger.getFuelConsumption();
        petrol =((Passenger) transport).getFuelConsumption()*
    }
}


