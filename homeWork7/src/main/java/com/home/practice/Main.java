package com.home.practice;

import com.home.heir1.Air;
import com.home.heir1.Terrestrial;
import com.home.heir2.Cargo;
import com.home.heir2.Passenger;
import com.home.heir3.Civil;
import com.home.heir3.Military;
import com.home.parentClass.Transport;

public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport();
        Cargo cargo = new Cargo();
        Passenger passenger = new Passenger();
        Civil civil = new Civil();
        Military military = new Military();
        System.out.println(cargo);
        System.out.println(passenger);
        System.out.println(civil);
        System.out.println(military);
        System.out.println(transport);
    }
}
