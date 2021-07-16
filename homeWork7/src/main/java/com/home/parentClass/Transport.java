package com.home.parentClass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Transport { //создаем родительский класс Транспорт
    // обьявляем переменные (делаем их закрытыми)
    private int power;  // мощность в лошадиных силах
    private int speed; // скорость км/ч
    private int weight; //масса кг
    private String brand; // марка Volvo

    public Transport() {
        System.out.println("Transport");
    }
}
