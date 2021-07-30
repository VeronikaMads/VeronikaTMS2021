package pRobots;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IHand;
import p11.IHead;
import p11.ILeg;

@Getter
@Setter
@ToString(callSuper = true)

public class RobotK560 extends Robot {
    public RobotK560(IHead head, IHand hand, ILeg leg) {
        super(head, hand, leg);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}


