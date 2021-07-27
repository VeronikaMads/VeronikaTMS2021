package pSony;

import p11.ILeg;

public class SonyLeg implements ILeg {
    private double price;

    public SonyLeg(double price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Идет нога Sony");
    }

    @Override
    public double getPrice() {
        return price;
    }
}