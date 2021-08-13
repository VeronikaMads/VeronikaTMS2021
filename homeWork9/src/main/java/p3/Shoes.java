package p3;

import p2.Clothes;
import p2.LegsClothes;

public class Shoes implements LegsClothes, Clothes {
    private Clothes.Status status = Clothes.Status.OFF;
    @Override
    public void putOn() {
        if (status == Clothes.Status.OFF) {
            status = Clothes.Status.ON;
            System.out.println("Туфли надеты");
        } else System.out.println("Вы уже надели туфли");
    }

    @Override
    public void takeOff() {
        if (status == Status.ON) {
            status = Status.OFF;
            System.out.println("Туфли сняты");
        } else System.out.println("На вас не былы надеты туфли");
    }
}
