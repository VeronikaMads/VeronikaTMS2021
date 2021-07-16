package com.home.heir3;

import com.home.heir1.Air;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Military extends Air { //Военный воздушный транспорт
    final boolean ejectionSystem = true; // поле - наличае системы катапультирования (true/false)
    private int missile; // количесвто ракет на борту

    @Override
    public String toString() {
        return "Military{" +
                "power=" + getPower() +
                ", speed=" + getSpeed() +
                ", weight=" + getWeight()+
                ", brand='" + getBrand() +
                ", wingspan=" + getWingspan() +
                ", runwayLength=" + getRunwayLength() +
                ", ejectionSystem=" + ejectionSystem +
                ", missile=" + missile +
                '}';
    }

    public Military(int power, int speed, int weight, String brand, double wingspan, int runwayLength, int missile) {
        super(power, speed, weight, brand, wingspan, runwayLength);
        this.missile = missile;
    }

    public Military() {
        this (200,2000,35500,"AСу-57",14,200,3);
        System.out.println("Military");
    }
}
