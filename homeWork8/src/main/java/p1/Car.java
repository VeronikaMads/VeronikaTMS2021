package p1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p2.Methods;

@Getter
@Setter
@ToString
@AllArgsConstructor

 public abstract class Car implements Methods { // создали класс машина
    private double speed; // скорость км/ч (средняя скорость движения авто)
    private String brand; // марка Volvo
    private double fuelConsumption; // поле - расход топлива л/100км/ч
    }