package com.home.model;


public class Main {
    public static void main(String[] args) {
        com.home.model.Computer computer = new com.home.model.Computer("Intel Core i3", 8, 8, 6);
        computer.info();
        computer.on();
        computer.off();
    }
}

