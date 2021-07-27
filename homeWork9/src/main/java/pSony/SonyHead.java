package pSony;

import p11.IHead;

public class SonyHead implements IHead { // класс голова
    private  double price;

    public SonyHead(double price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");

    }

    @Override
    public double getPrice() {
        return price;
    }
}
