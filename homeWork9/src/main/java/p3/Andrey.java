package p3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p2.BodyClothes;
import p2.LegsClothes;
import p2.PantsClothes;
import p2.Person;

@Getter
@Setter
@ToString(callSuper = true)
public class Andrey extends Person {

    public Andrey() {
    }

    public Andrey(String name, LegsClothes legsClothes, BodyClothes bodyClothes, PantsClothes pantsClothes) {
        super(name, legsClothes, bodyClothes, pantsClothes);
    }

    @Override
    public void putOn() {

    }

    @Override
    public void takeOff() {

    }
}
