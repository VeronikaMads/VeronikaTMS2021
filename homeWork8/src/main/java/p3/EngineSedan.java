package p3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p1.Engine;


@Getter
@Setter
@ToString(callSuper = true)
public class EngineSedan extends Engine {
    public EngineSedan(double powerEngine, double howMuchFuelUsage) {
        super(powerEngine, howMuchFuelUsage);
    }
}

