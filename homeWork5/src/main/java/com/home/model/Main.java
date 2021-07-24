package com.home.model;

import com.home.model.Computer;


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i3", 8, 8, 1);
        computer.info();
        computer.on();
        computer.off();
    }
}

