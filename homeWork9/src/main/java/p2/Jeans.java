package p2;

public class Jeans implements PantsClothes {
    private Clothes.Status status = Clothes.Status.OFF;
    @Override
    public void putOn() {
        if (status == Clothes.Status.OFF) {
            status = Clothes.Status.ON;
            System.out.println("Пальто надето");
        } else System.out.println("Вы уже надели пальто");
    }

    @Override
    public void takeOff() {
        if (status == Clothes.Status.OFF) {
            status = Clothes.Status.ON;
            System.out.println("Пальто снято");
        } else System.out.println("На вас не было надето пальто");

    }
}
