package p3;

import p2.BodyClothes;
import p2.Clothes;

public class Blazer implements BodyClothes {
    private Clothes.Status status = Clothes.Status.OFF;

    @Override
    public void putOn() {
        if (status == Clothes.Status.OFF) {
            status = Clothes.Status.ON;
            System.out.println("Мастерка надета");
        } else System.out.println("Вы уже надели мастерку");
    }

    @Override
    public void takeOff() {
        if (status == Clothes.Status.ON) {
            status = Clothes.Status.OFF;
            System.out.println("Мастерка снята");
        } else {
            System.out.println("На вас не была надета мастерка");
        }
    }

}

