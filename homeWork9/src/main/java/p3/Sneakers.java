package p3;

import p2.Clothes;
import p2.LegsClothes;

public class Sneakers implements LegsClothes {
    private Clothes.Status status = Clothes.Status.OFF;
    @Override
    public void putOn() {
        if (status == Clothes.Status.OFF) {
            status = Clothes.Status.ON;
            System.out.println("Кроссовки надеты");
        } else System.out.println("Вы уже надели кроссовки");
    }

    @Override
    public void takeOff() {
        if (status == Clothes.Status.ON) {
            status = Clothes.Status.OFF;
            System.out.println("Кроссовки сняты");
        } else System.out.println("На вас не былы надеты кроссовки");
    }
}
