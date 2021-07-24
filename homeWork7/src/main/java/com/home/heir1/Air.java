package com.home.heir1;

import com.home.parentClass.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder

public abstract class Air extends Transport { // класс Воздушынй
    private double wingspan; // поле - размах крыльев (м)
    private double runwayLength; // поле - Минимальная длина взлётно-посадочной полосы для взлёта (м)
}


