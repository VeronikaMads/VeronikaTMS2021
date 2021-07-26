package com.home.heir1;

import com.home.parentClass.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@Getter
@Setter
@SuperBuilder
public abstract class Terrestrial extends Transport { // класс Наземный //  делаем класс абстрактным.
    private int numberOfWheels;// поле - количество колес
    private int fuelConsumption; // поле - расход топлива л/100км

}
