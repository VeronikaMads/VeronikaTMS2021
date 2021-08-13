package p2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Person implements Clothes {
    private String name;
    private LegsClothes legsClothes;
    private BodyClothes bodyClothes;
    private PantsClothes pantsClothes;

    public Person() {
    }

    public Person(String name, LegsClothes legsClothes, BodyClothes bodyClothes, PantsClothes pantsClothes) {
        this.name = name;
        this.legsClothes = legsClothes;
        this.bodyClothes = bodyClothes;
        this.pantsClothes = pantsClothes;
    }

    public void getDressed() {
        legsClothes.putOn();
        bodyClothes.putOn();
        pantsClothes.putOn();
    }

    public void unDress() {
        legsClothes.takeOff();
        bodyClothes.takeOff();
        pantsClothes.takeOff();

    }
}
