package com.home.heir2;

import com.home.heir1.Terrestrial;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class Passenger extends Terrestrial { // класс Легковой
    private String bodyType; // поле - Тип кузова
    private int numberOfPassengers; // поле - Количество пассажиров

    public Passenger(double power, double speed, double weight, String brand, int numberOfWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, speed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Passenger() {
        this(215,150,2500,"Audi",4,12,"универсал",5);
        System.out.println("Passenger");
    }
}
