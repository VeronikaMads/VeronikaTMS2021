package p2;

import jdk.jshell.Snippet;

public class ClassicPants implements PantsClothes {
    private Clothes.Status status = Clothes.Status.OFF;

    @Override
    public void putOn() {
        if (status == Clothes.Status.OFF) {
            status = Clothes.Status.ON;
            System.out.println("Брюки надеты");
        } else System.out.println("Вы уже надели брюки");
    }

    @Override
    public void takeOff() {
        if (status == Clothes.Status.ON) {
            status = Clothes.Status.OFF;
            System.out.println("Брюки сняты");
        } else {
            System.out.println("На вас не были надеты брюки");
        }
    }
}
