package Samsung;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IHead;

@Setter
@Getter
@ToString(callSuper = true)
public class SamsungHead implements IHead { // класс голова
    private double price;

    public SamsungHead() {
    }

    public SamsungHead(double price) {
        this.price = price;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");

    }

    @Override
    public double getPrice() {
        return price;
    }
}
