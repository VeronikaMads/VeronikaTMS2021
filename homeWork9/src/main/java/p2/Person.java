package p2;

public abstract class Person implements LegsClothes, BodyClothes, PantsClothes {
    private String name;
    private LegsClothes shoes;
    private BodyClothes jacket;
    private PantsClothes pants;

    public Person(String name, LegsClothes shoes, BodyClothes jacket, PantsClothes pants) {
        this.name = name;
        this.shoes = shoes;
        this.jacket = jacket;
        this.pants = pants;
    }

    public void getDressed() {
        shoes.putOn();
        jacket.putOn();
        pants.putOn();
    }

    public void unDress() {
        shoes.takeOff();
        jacket.takeOff();
        pants.takeOff();

    }
}
