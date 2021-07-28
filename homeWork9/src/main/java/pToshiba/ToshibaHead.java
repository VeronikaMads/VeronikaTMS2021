package pToshiba;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IHead;

@Getter
@Setter
@ToString(callSuper = true)
public class ToshibaHead implements IHead { // класс голова
    private double price;

    public ToshibaHead() {
    }

    public ToshibaHead(double price) {
        this.price = price;
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
