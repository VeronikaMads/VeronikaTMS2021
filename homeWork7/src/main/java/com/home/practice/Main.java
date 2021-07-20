package com.home.practice;

import com.home.heir1.Air;
import com.home.heir1.Terrestrial;
import com.home.heir2.Cargo;
import com.home.heir2.Passenger;
import com.home.heir3.Civil;
import com.home.heir3.Military;
import com.home.parentClass.Transport;
import com.sun.jdi.connect.Transport;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport();
        Cargo cargo = new Cargo();
        Passenger passenger = new Passenger();
        Civil civil = new Civil();
        Military military = new Military();
        civil.setPower(1505);
        civil.setSpeed(350);
        civil.setWeight(43998);
        civil.setBrand("Boeing 737");
        civil.setWingspan(28.35);
        civil.setRunwayLength(2000);
        civil.setNumbOfPassengers(103);
        military.setPower(200);
        military.setSpeed(2000);
        military.setWeight(35500);
        military.setBrand("AСу-57");
        military.setWingspan(14);
        military.setRunwayLength(200);
        military.setMissile(3);
        passenger.setPower(215);
        passenger.setSpeed(150);
        passenger.setWeight(2500);
        passenger.setBrand("Audi");
        passenger.setNumberOfWheels(4);
        passenger.setFuelConsumption(12);
        passenger.setBodyType("универсал");
        passenger.setNumberOfPassengers(5);
        cargo.setPower(750);
        cargo.setSpeed(276);
        cargo.setWeight(60000);
        cargo.setBrand("Volvo Trucks");
        cargo.setNumberOfWheels(8);
        cargo.setFuelConsumption(26);
        cargo.setLoadCapacity(23);

        System.out.println(cargo);
        System.out.println(passenger);
        System.out.println(civil);
        System.out.println(military);
        System.out.println(transport);
    }
}
