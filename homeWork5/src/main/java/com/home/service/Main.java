package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.processor = "Intel Core i3";
        computer.ddr = "8";
        computer.ssd = 8;
        computer.recurs = 1;
        computer.info();
        computer.on();
        computer.burn();
        computer.off();
    }
}

