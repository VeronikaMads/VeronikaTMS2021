package Samsung;

import p11.ILeg;

public class SamsungLeg implements ILeg {
    private double price;

    public SamsungLeg(double price) {
        this.price = price;
    }

    public SamsungLeg() {
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
