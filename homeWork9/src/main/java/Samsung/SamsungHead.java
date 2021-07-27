package Samsung;


import p11.IHead;

public class SamsungHead implements IHead { // класс голова
    private  double price;

    public SamsungHead(double price) {
        this.price = price;
    }

    public SamsungHead() {
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
