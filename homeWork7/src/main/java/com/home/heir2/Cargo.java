package com.home.heir2;

import com.home.heir1.Terrestrial;
import com.home.heir3.Civil;
import com.home.heir3.Military;
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


    @Override
    public void passengerAllInfo(Passenger passenger, double time) {

    }

    @Override
    public void cargoWeightInfo(Cargo cargo) {

    }

    @Override
    public void civilInfo(Civil civil) {

    }

    @Override
    public void militaryRacketInfo(Military military) {

    }

    @Override
    public void militaryCatapultInfo(Military military) {

    }
}
