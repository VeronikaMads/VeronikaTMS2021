package pToshiba;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.ILeg;

@Getter
@Setter
@ToString(callSuper = true)
public class ToshibaLeg implements ILeg {
    private double price;

    public ToshibaLeg() {
    }

    public ToshibaLeg(double price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Идет нога Toshiba");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
