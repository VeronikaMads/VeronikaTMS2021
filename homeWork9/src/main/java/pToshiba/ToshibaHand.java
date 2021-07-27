package pToshiba;

import p11.IHand;
import p11.IHead;


public class ToshibaHand implements IHand, IHead { // класс рука
    private double price;

    public ToshibaHand(double price) {
        this.price = price;
    }

    public ToshibaHand() {
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
