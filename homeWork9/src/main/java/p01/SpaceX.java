package p01;

import java.util.Random;

//По аналогии Shuttle создайте еще пару классов реализующих интерфейс
public class SpaceX implements IStart{
    @Override
    public boolean check() {
        Random generate = new Random();
        return generate.nextBoolean();//возвращал true либо false в зависимости от того прошла ли она успешно.
    }

    @Override
    public void ignition() {
        System.out.println("Двигатели ракеты Super Heavy запущены.\nВсе системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт ракеты Super Heavy");
    }
}
