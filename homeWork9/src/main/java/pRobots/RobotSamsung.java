package pRobots;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IHand;
import p11.IHead;
import p11.ILeg;

@Getter
@Setter
@ToString(callSuper = true)
public class RobotSamsung extends Robot {
    private final String brand;

    public RobotSamsung(IHead head, IHand hand, ILeg leg, String brand) {
        super(head, hand, leg);
        this.brand = brand;
    }

    @Override
    public void action() {
        super.action();
    }

}

