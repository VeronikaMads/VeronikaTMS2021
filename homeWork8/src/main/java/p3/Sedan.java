package p3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.Car;

@Getter
@Setter

@ToString(callSuper = true)
public class Sedan extends Car{
    public Sedan(double speedCar, String brandCar) {
        super(speedCar, brandCar);
    }

}

