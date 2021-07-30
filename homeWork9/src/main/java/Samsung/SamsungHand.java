package Samsung;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IHand;


@Getter
@Setter
@ToString(callSuper = true)
public class SamsungHand implements IHand { // класс рука
    private double price;

    public SamsungHand() {
    }

    public SamsungHand(double price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука вверх Samsung");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
