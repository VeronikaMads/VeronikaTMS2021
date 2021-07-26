package com.home.heir3;

import com.home.heir1.Air;
import com.home.heir2.Cargo;
import com.home.heir2.Passenger;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@ToString(callSuper = true)
@Getter
@Setter
@SuperBuilder
public  class Military extends Air { //Военный воздушный транспорт
    final boolean ejectionSystem = true; // поле - наличае системы катапультирования (true/false)
    private int missile; // количесвто ракет на борту

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

