package p01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Запустите в космос созданные вами космические корабли используя созданный вами космодром и его метод старт.
        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();
        Spaceport canaveral = new Spaceport();
        ArrayList<IStart> rackets = new ArrayList<>();
        rackets.add(shuttle);
        rackets.add(spaceX);
        for (IStart racket: rackets) {
            try {
                canaveral.launch(racket);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            System.out.println();
            }

        }
    }
