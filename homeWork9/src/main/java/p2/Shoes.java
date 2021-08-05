package p2;

public class Shoes implements LegsClothes {
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
        if (status == Clothes.Status.OFF) {
            status = Clothes.Status.ON;
            System.out.println("Туфли сняты");
        } else System.out.println("На вас не былы надеты туфли");
    }
}
