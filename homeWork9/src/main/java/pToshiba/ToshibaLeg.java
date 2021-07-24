package pToshiba;

import p11.ILeg;

public class ToshibaLeg implements ILeg {
    private double price;

    public ToshibaLeg(double price) {
        this.price = price;
    }

    public ToshibaLeg() {
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
