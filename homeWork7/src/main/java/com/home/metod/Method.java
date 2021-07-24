package com.home.metod;

import com.home.parentClass.Transport;


public interface Method {
    default double getPower(double power) {
        return power * 0.74;
    }

    default void passengerDistanceInfo(Transport transport, double time, double distance) {
    }
    default void passengerPetrolInfo (Transport transport, double petrol){
    }
//    default void passengerAllInfo (Transport transport){
//    }

    default void cargoWeightInfo(Transport transport) {
    }

    default void civilInfo(Transport transport) {
    }

    default void militaryRacketInfo(Transport transport) {
    }

    default void militaryCatapultInfo(Transport transport) {
    }
}

