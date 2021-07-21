package com.home.heir2;

import com.home.heir1.Terrestrial;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder

public class Cargo extends Terrestrial { // класс Грузовой наследник класса Наземный
    private double loadCapacity; // поле - грузоподьмность транспорта (т)

}
