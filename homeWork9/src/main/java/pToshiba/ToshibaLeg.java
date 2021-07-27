package pToshiba;


import p11.IHand;
import p11.ILeg;

public class ToshibaLeg implements ILeg, IHand {
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
    public void upHand() {

    }

    @Override
    public double getPrice() {
        return price;
    }
}
