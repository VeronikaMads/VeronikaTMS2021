package com.home.heir2;

import com.home.heir1.Terrestrial;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class Cargo extends Terrestrial { // класс Грузовой наследник класса Наземный
    private int loadCapacity; // поле - грузоподьмность транспорта (т)


    public Cargo(double power, double speed, double weight, String brand, int numberOfWheels, int fuelConsumption, int loadCapacity) {
        super(power, speed, weight, brand, numberOfWheels, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public Cargo() {
        this(750, 276, 60000,"Volvo Trucks",8,26,23);
        System.out.println("Cargo");
    }
}
