package p14;

import Samsung.SamsungHand;
import Samsung.SamsungHead;
import Samsung.SamsungLeg;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import p11.IRobot;
import pRobots.Robot;
import pRobots.RobotC507;
import pRobots.RobotK560;
import pRobots.RobotV554;
import pSony.SonyHand;
import pSony.SonyHead;
import pSony.SonyLeg;
import pToshiba.ToshibaHand;
import pToshiba.ToshibaHead;
import pToshiba.ToshibaLeg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        SonyHead sonyHead = new SonyHead(2000);
        ToshibaHead toshibaHead = new ToshibaHead(2580);
        SamsungHead samsungHead = new SamsungHead(2100);

        SonyHand sonyHand = new SonyHand(6500);
        ToshibaHand toshibaHand = new ToshibaHand(5800);
        SamsungHand samsungHand = new SamsungHand(4500);

        SonyLeg sonyLeg = new SonyLeg(3650);
        ToshibaLeg toshibaLeg = new ToshibaLeg(4250);
        SamsungLeg samsungLeg = new SamsungLeg(2900);


        Robot robotC507 = new RobotC507(samsungHead, sonyHand, toshibaLeg);
        Robot robotK560 = new RobotK560(toshibaHead, toshibaHand, sonyLeg);
        Robot robotV554 = new RobotV554(samsungHead, sonyHand, samsungLeg);

        ArrayList<IRobot> robots = new ArrayList<>();
        robots.add(robotC507);
        robots.add(robotK560);
        robots.add(robotV554);
        for (IRobot robot : robots) {
            robot.action();
        }

        ArrayList<Robot> robotises = new ArrayList<>();
        robotises.add(robotC507);
        robotises.add(robotK560);
        robotises.add(robotV554);
        for (Robot robot : robotises) {
            System.out.println("Цены: "+robot.getPrice());
        }


        Robot maxPriceRobots = Collections.max(robotises, new Comparator<Robot>() {
            @Override
            public int compare(Robot o1, Robot o2) {
                if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                } else if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("Робот с максимальной ценой: " + maxPriceRobots);
    }
}
