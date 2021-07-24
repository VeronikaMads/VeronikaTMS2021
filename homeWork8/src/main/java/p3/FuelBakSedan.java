package p3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.FuelBakCar;
@Getter
@Setter
@ToString(callSuper = true)

public class FuelBakSedan extends FuelBakCar {
    public FuelBakSedan(double howMuchFuelingBak, double whatMaxBakVolume, String typesOfFuelBak) {
        super(howMuchFuelingBak, whatMaxBakVolume, typesOfFuelBak);
    }
}
