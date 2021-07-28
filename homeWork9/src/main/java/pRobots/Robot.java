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
public abstract class Robot implements IRobot{
    private IHead head;
    private IHand hand;
    private ILeg leg;
    private IRobot getPrice;

    public Robot(IHead head, IHand hand, ILeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();
    }

    @Override
    public double getPrice() {
        double price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}


