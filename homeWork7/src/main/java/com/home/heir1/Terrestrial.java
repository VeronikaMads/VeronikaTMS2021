package com.home.heir1;

import com.home.parentClass.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@Setter
public class Terrestrial extends Transport { // класс Наземный
    private int numberOfWheels;// поле - количество колес
    private int fuelConsumption; // поле - расход топлива л/100км

    public Terrestrial(double power, double speed, double weight, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, speed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }


    public Terrestrial() {
        this(210, 180, 2400, "Audi A4", 4, 10);
        System.out.println("Terrestrial");
    }
}
