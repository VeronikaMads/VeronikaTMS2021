package com.home.heir3;

import com.home.heir1.Air;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Civil extends Air { // класс - Гражданский воздушный транспорт
    private int numbOfPassengers; // поле - количество пассажиров
    final boolean businessClass = true; // поле - наличие бизнес класса

    @Override
    public String toString() {
        return "Civil{" +
                "power=" + getPower() +
                ", speed=" + getSpeed() +
                ", weight=" + getWeight()+
                ", brand='" + getBrand() +
                ", wingspan=" + getWingspan() +
                ", runwayLength=" + getRunwayLength() +
                ", numbOfPassengers=" + numbOfPassengers +
                ", businessClass=" + businessClass +
                '}';
    }

    public Civil(int power, int speed, int weight, String brand, double wingspan, int runwayLength, int numbOfPassengers) {
        super(power, speed, weight, brand, wingspan, runwayLength);
        this.numbOfPassengers = numbOfPassengers;
    }

    public Civil() {
        this(1505,350,43998,"Boeing 737",28.35,2000,103);
        System.out.println("Civil");
    }
}




