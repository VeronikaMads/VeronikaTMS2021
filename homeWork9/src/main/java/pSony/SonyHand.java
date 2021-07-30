package pSony;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IHand;

@Getter
@Setter
@ToString(callSuper = true)
public class SonyHand implements IHand { // класс рука
    private double price;

    public SonyHand() {
    }

    public SonyHand(double price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука вверх Sony");
    }


    @Override
    public double getPrice() {
        return price;
    }
}
