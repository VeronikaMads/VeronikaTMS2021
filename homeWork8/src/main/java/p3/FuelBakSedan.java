package p3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.FuelBakCar;


@Setter
@Getter
@ToString(callSuper = true)

public class FuelBakSedan extends FuelBakCar {
    public FuelBakSedan(double howMuchFuelingBak, double maxVolume, String typesOfFuelBak) {
        super(howMuchFuelingBak, maxVolume, typesOfFuelBak);
    }
}

