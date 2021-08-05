package p3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.Machine;
import p1.MachineMethods;


@Getter
@Setter

@ToString(callSuper = true)
public class Nissan extends Machine implements MachineMethods {

    public Nissan(String brandCar, double speedCar, double price) {
        super(brandCar, speedCar, price);
    }

    @Override
    public void start(Machine machine) {

    }
}

