package p3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.Machine;


@Getter
@Setter

@ToString(callSuper = true)
public class Audi extends Machine {

    public Audi(String brandCar, double speedCar, double price) {
        super(brandCar, speedCar, price);
    }
}

