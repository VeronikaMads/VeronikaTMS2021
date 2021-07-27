package Samsung;


import p11.IHand;
import p11.ILeg;

public class SamsungLeg implements ILeg, IHand {
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
    public void upHand() {

    }

    @Override
    public double getPrice() {
        return price;
    }
}
