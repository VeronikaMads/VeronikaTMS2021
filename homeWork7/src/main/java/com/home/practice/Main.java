package com.home.practice;

import com.home.heir2.Cargo;
import com.home.heir2.Passenger;
import com.home.heir3.Civil;
import com.home.heir3.Military;
import com.home.metod.Calculation;
import com.home.parentClass.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder

public class Main {
    private Calculation calculation;

    public static void main(String[] args) {

        Cargo cargo = Cargo.builder()
                .power(750)
                .speed(276.5)
                .weight(60000)
                .brand("Volvo Trucks")
                .numberOfWheels(8)
                .fuelConsumption(26)
                .loadCapacity(23)
                .build();

        Passenger passenger = Passenger.builder()
                .power(215)
                .speed(155.5)
                .weight(2500)
                .brand("Audi")
                .numberOfWheels(4)
                .fuelConsumption(12)
                .bodyType("универсал")
                .numberOfPassengers(5)
                .build();

        Civil civil = Civil.builder()
                .power(1505)
                .speed(355.6)
                .weight(43998.20)
                .brand("Boeing 737")
                .wingspan(28.35)
                .runwayLength(2000)
                .numbOfPassengers(103)
                .build();

        Military military = Military.builder()
                .power(200)
                .speed(2500)
                .weight(35500.2)
                .brand("AСу-57")
                .wingspan(14)
                .runwayLength(200)
                .missile(3)
                .build();

        Transport[] transports = {cargo, passenger, civil, military};

        System.out.println(cargo);
        System.out.println(passenger);
        System.out.println(civil);
        System.out.println(military);

        Calculation calculation = new Calculation();
        calculation.passengerAllInfo(passenger,25);
        calculation.cargoWeightInfo(cargo);
        calculation.civilInfo(civil);
        calculation.militaryCatapultInfo(military);
        calculation.militaryRacketInfo(military);

    }
}
