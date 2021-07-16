package com.home.heir2;

import com.home.heir1.Terrestrial;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Cargo extends Terrestrial { // класс Грузовой наследник класса Наземный
    private int loadCapacity; // поле - грузоподьмность транспорта (т)

    @Override
    public String toString() {
        return "Cargo{" +
                "power=" + getPower() +
                ", speed=" + getSpeed() +
                ", weight=" + getWeight() +
                ", brand='" + getBrand() +
                ", numberOfWheels=" + getNumberOfWheels()+
                ", fuelConsumption=" + getFuelConsumption() +
                ", loadCapacity=" + loadCapacity +
                '}';
    }

    public Cargo(int power, int speed, int weight, String brand, int numberOfWheels, int fuelConsumption, int loadCapacity) {
        super(power, speed, weight, brand, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }
    public Cargo() {
        this(750, 276, 60000,"Volvo Trucks",8,26,23);
        System.out.println("Cargo");
    }
}
