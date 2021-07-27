package pSony;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IHand;
import p11.IHead;
import p11.ILeg;


@Getter
@Setter
@ToString(callSuper = true)
public class SonyHand implements IHand, IHead, ILeg { // класс рука
    private double price;

    public SonyHand(double price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднимается рука вверх Sony");
    }

    @Override
    public void speak() {

    }

    @Override
    public void step() {

    }

    @Override
    public double getPrice() {
        return price;
    }
}
