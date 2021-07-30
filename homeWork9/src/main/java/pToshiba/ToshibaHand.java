package pToshiba;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IHand;

@ToString(callSuper = true)
@Setter
@Getter
public class ToshibaHand implements IHand { // класс рука
    private double price;

    public ToshibaHand() {
    }

    public ToshibaHand(double price) {
        this.price = price;
    }


    @Override
    public void upHand() {
        System.out.println("Поднимается рука вверх Toshiba");
    }

    @Override
    public double getPrice() {
        return price;
    }
}
