package p1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import p2.Methods;

@Getter
@Setter
@SuperBuilder
@ToString
@AllArgsConstructor

public abstract class Car implements Methods { // создали класс машина
    private double power;  // мощность в лошадиных силах
    private double speed; // скорость км/ч (средняя скорость движения авто)
    private String brand; // марка Volvo
    private double fuelConsumption; // поле - расход топлива л/100км/ч

    public Car(double power, double speed, String brand, double fuelConsumption) {
        this.power = power;
        this.speed = speed;
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
    }
}