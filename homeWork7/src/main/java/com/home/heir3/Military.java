package com.home.heir3;

import com.home.heir1.Air;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@Setter
public class Military extends Air { //Военный воздушный транспорт
    final boolean ejectionSystem = true; // поле - наличае системы катапультирования (true/false)
    private int missile; // количесвто ракет на борту

    public Military(double power, double speed, double weight, String brand, double wingspan, double runwayLength, int missile) {
        super(power, speed, weight, brand, wingspan, runwayLength);
        this.missile = missile;
    }

    public Military() {
        this (200,2000,35500,"AСу-57",14,200,3);
        System.out.println("Military");
    }
}
