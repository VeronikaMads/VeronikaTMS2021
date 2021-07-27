package com.home.heir3;

import com.home.heir1.Air;
import com.home.heir2.Cargo;
import com.home.heir2.Passenger;
import com.home.parentClass.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@Getter
@Setter
@SuperBuilder
public class Civil extends Air { // класс - Гражданский воздушный транспорт
    private int numbOfPassengers; // поле - количество пассажиров
    final boolean businessClass = true; // поле - наличие бизнес класса

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




