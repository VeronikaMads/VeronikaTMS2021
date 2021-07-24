package p3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.FuelBak;
import p2.MethodsFuelBak;

@Getter
@Setter
@ToString(callSuper = true)


public class FuelBakSedan extends FuelBak implements MethodsFuelBak {
    public FuelBakSedan(double howMuchFuelingBak, double whatMaxBakVolume, String typesOfFuelBak) {
        super(howMuchFuelingBak, whatMaxBakVolume, typesOfFuelBak);
    }

    @Override
    public void checkFuel(FuelBak fuelBak) {

    }

    @Override
    public void fuelFillingBak(FuelBak fuelBak) {

    }
}





