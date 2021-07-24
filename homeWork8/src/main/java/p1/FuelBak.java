package p1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public abstract class FuelBak { //создали класс бензобак
    private double howMuchFuelingBak; // поле - количесвто топлива в баке
    private double whatMaxBakVolume; // поле - объем бака для топлива
    private String typesOfFuelBak; // тип топливного бака (из чего сделан)

}
