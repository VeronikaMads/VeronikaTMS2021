package com.home.model;


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel Core i3", 8, 8, 6);
        computer.info();
        computer.on();
        computer.off();
    }
}

