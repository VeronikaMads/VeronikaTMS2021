package com.home.metod;

import com.home.heir2.Cargo;
import com.home.heir2.Passenger;
import com.home.heir3.Civil;
import com.home.heir3.Military;


public interface Method {

    default double getPower(double power) {// переводим лошадиные силы в КВ (мощность)
        return power * 0.74;
    }
    void passengerAllInfo(Passenger passenger, double time);

    void cargoWeightInfo(Cargo cargo); // метод о грузоподьемносии грузового авто

    void civilInfo(Civil civil); // метод инфо о количестве пассажиров в гражданском самолете

    void militaryRacketInfo(Military military); // метод вывода ракет

    void militaryCatapultInfo(Military military); //  метод катапульта

}
