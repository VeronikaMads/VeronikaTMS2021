package com.home.heir3;

import com.home.heir1.Air;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@Setter
public class Civil extends Air { // класс - Гражданский воздушный транспорт
    private int numbOfPassengers; // поле - количество пассажиров
    final boolean businessClass = true; // поле - наличие бизнес класса

    public Civil(double power, double speed, double weight, String brand, double wingspan, double runwayLength, int numbOfPassengers) {
        super(power, speed, weight, brand, wingspan, runwayLength);
        this.numbOfPassengers = numbOfPassengers;
    }

    public Civil() {
        this(1505,350,43998,"Boeing 737",28.35,2000,103);
        System.out.println("Civil");
    }
}




