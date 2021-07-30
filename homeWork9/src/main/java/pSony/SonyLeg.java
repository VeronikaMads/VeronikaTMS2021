package pSony;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.ILeg;

@Setter
@Getter
@ToString(callSuper = true)
public class SonyLeg implements ILeg {
    private double price;

    public SonyLeg() {
    }

    public SonyLeg(double price) {
        this.price = price;
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
