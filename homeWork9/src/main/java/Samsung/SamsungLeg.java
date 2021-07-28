package Samsung;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.ILeg;

@Setter
@Getter
@ToString(callSuper = true)
public class SamsungLeg implements ILeg {
    private double price;

    public SamsungLeg() {
    }

    public SamsungLeg(double price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Идет нога Samsung");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
