package p14;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pSony.SonyHand;
@Setter
@Getter
@ToString(callSuper = true)
public class Main {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SonyHand sonyHand = new SonyHand(20);
        sonyHand.getPrice();
        sonyHand.upHand();
    }
}
