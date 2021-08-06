package p4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p2.*;
import p3.*;

import java.util.ArrayList;
@Getter
@Setter
@ToString(callSuper = true)
public class Main {
    public static void main(String[] args) {
        BodyClothes blazer = new Blazer();
        BodyClothes coat = new Coat();
        PantsClothes classicPants = new ClassicPants();
        PantsClothes jeans = new Jeans();
        LegsClothes sneakers = new Sneakers();
        LegsClothes shoes = new Shoes();

//        BodyClothes[] body = new BodyClothes[]{blazer,coat};
//        for (BodyClothes clothes1:body){
//            clothes1.putOn();
//            clothes1.takeOff();
//        }
//        PantsClothes[] pants = new PantsClothes[]{classicPants,jeans};
//        for (PantsClothes clothes2:pants){
//            clothes2.putOn();
//            clothes2.takeOff();
//        }
//        LegsClothes[] legs = new  LegsClothes[]{shoes,sneakers};
//        for ( LegsClothes clothes3:legs){
//            clothes3.putOn();
//            clothes3.takeOff();
//        }

        Person andrey = new Andrey("Андрей",shoes,blazer,jeans );
        ArrayList<Person> people = new ArrayList<>();
        people.add(andrey);
        for (Person person:people){
            person.getDressed();
            person.unDress();
        }
    }
}
