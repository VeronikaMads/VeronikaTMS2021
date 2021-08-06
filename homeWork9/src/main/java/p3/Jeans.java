package p3;

import p2.Clothes;
import p2.PantsClothes;

public class Jeans implements PantsClothes, Clothes {
    private Clothes.Status status = Clothes.Status.OFF;
    @Override
    public void putOn() {
        if (status == Clothes.Status.OFF) {
            status = Clothes.Status.ON;
            System.out.println("Джинсы надеты");
        } else System.out.println("Вы уже надели джинсы");
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Джинсы сняты");
        } else System.out.println("На вас не были надеты джинсы");

    }
}
