package com.home.heir2;

import com.home.heir1.Terrestrial;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Passenger extends Terrestrial { // класс Легковой
    private String bodyType; // поле - Тип кузова
    private int numberOfPassengers; // поле - Количество пассажиров

    @Override
    public String toString() {
        return "Passenger{" +
                "power=" + getPower() +
                ", speed=" + getSpeed() +
                ", weight=" + getWeight() +
                ", brand='" + getBrand() +
                ", numberOfWheels=" + getNumberOfWheels()+
                ", fuelConsumption=" + getFuelConsumption() +
                ", bodyType='" + bodyType + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                '}';
    }

    public Passenger(int power, int speed, int weight, String brand, int numberOfWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        super(power, speed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Passenger() {
        this(215,150,2500,"Audi",4,12,"универсал",5);
        System.out.println("Passenger");
    }
}
