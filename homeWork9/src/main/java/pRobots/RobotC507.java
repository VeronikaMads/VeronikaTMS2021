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
public class RobotC507 extends Robot {

    public RobotC507(IHead head, IHand hand, ILeg leg) {
        super(head, hand, leg);
    }
}


