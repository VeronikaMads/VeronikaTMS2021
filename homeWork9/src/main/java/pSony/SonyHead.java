package pSony;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IHead;

@Getter
@Setter
@ToString(callSuper = true)

public class SonyHead implements IHead { // класс голова
    private double price;

    public SonyHead() {
    }

    public SonyHead(double price) {
        this.price = price;
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
