package com.home.heir1;

import com.home.parentClass.Transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Terrestrial extends Transport { // класс Наземный
    private int numberOfWheels;// поле - количество колес
    private  int fuelConsumption; // поле - расход топлива л/100км

    @Override
    public String toString() {
        return "Terrestrial{" +
                "power=" + getPower() +
                ", speed=" + getSpeed() +
                ", weight=" + getWeight() +
                ", brand='" + getBrand() +
                ", numberOfWheels=" + numberOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    public Terrestrial(int power, int speed, int weight, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, speed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
    public Terrestrial() {
        this(210,180,2400,"Audi A4",4,10);
        System.out.println("Terrestrial");
    }
}
