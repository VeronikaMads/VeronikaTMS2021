package Samsung;

import lombok.Getter;
import lombok.Setter;
import p11.IHand;
import p11.IHead;


@Getter
@Setter
public class SamsungHand implements IHand, IHead { // класс рука
    private double price;

    public SamsungHand(double price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука вверх Toshiba");
    }

    @Override
    public void speak() {

    }

    @Override
    public double getPrice() {
        return price;
    }
}
