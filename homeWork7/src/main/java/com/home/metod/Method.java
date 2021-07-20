package com.home.metod;

public interface Method {
    default double getPower(double power) {
        return power*0.74;
    }
}
