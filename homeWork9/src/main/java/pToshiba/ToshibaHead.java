package pToshiba;


import p11.IHead;

public class ToshibaHead implements IHead { // класс голова
    private  double price;

    public ToshibaHead(double price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");

    }

    @Override
    public double getPrice() {
        return price;
    }
}
