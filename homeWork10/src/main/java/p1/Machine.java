package p1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public abstract class Machine {
    private String brandCar; // марка авто
    private double speedCar; // макс. скорость км/ч
    private double price; // цена в у.е.

}
