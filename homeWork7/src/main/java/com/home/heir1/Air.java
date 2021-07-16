package com.home.heir1;

import com.home.parentClass.Transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Air extends Transport { // класс Воздушынй
    private double wingspan; // поле - размах крыльев (м)
    private int runwayLength; // поле - Минимальная длина взлётно-посадочной полосы для взлёта (м)

    @Override
    public String toString() {
        return "Air{" +
                "power=" + getPower() +
                ", speed=" + getSpeed() +
                ", weight=" + getWeight()+
                ", brand='" + getBrand() +
                ", wingspan=" + getWingspan() +
                ", runwayLength=" + runwayLength +
                '}';
    }

    public Air(int power, int speed, int weight, String brand, double wingspan, int runwayLength) {
        super(power, speed, weight, brand);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;
    }

    public Air() {
        this(45000, 700, 50000,"Airbus A330-200",60,600);
        System.out.println("Air");
    }
}

