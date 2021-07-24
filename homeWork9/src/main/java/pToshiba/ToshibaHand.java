package pToshiba;

import p11.IHand;

public class ToshibaHand implements IHand { // класс рука
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
    public double getPrice() {
        return price;
    }
}
