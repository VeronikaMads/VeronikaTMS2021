package p1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public abstract class Car { // создали класс машина
    private double speedCar; // скорость км/ч (средняя скорость движения авто)
    private String brandCar; // марка авто
}