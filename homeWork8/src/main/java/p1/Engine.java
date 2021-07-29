package p1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Engine  { // класс - Двигатель
    private double powerEngine; //    мощность двигателя;
    private double howMuchFuelUsage; // поле - расход топлива л/100км
 }

