package pRobots;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IHand;
import p11.IHead;
import p11.ILeg;
import p11.IRobot;

@Getter
@Setter
@ToString
public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private ILeg leg;


public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        }

//public class Robot implements IRobot,IHand,IHead,ILeg {
//    private String head;
//    private String hand;
//    private String leg;
//    public Robot(String head, String hand, String leg) {
//        this.head = head;
//        this.hand = hand;
//        this.leg = leg;
//    }
//    @Override
//    public void action() {
//        speak();
//        upHand();
//        step();
//    }
@Override
public void action() {
    head.speak();
    hand.upHand();
    leg.step();
}

    public Robot() {
    }


    @Override
    public double getPrice() {
        double price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}

