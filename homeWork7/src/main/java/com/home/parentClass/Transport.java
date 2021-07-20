package com.home.parentClass;

import com.home.metod.Method;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@Getter
@Setter

public class Transport implements Method { //создаем родительский класс Транспорт
    // обьявляем переменные (делаем их закрытыми)
    private double power;  // мощность в лошадиных силах
    private double speed; // скорость км/ч
    private double weight; //масса кг
    private String brand; // марка Volvo

    @Override
    public String toString() {
        return "Transport{" +
                "power kB=" + getPower(power) +
                ", speed km / h=" + speed +
                ", weight Kg=" + weight +
                ", brand ='" + brand + '\'' +
                '}';
    }

    public Transport() {
        System.out.println("Transport");
    }
}
