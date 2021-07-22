package p2;

import p1.Car;

public interface Methods {
    //    Чтобы поехать, машину необходимо завести
    // создаем метод onCar
    void onCar();

    //Чтобы машину завести нужно включить двигатель.
    // создаем метод onEngine
    void onEngine();

    // создаем метод движения машины
    void goesCar();

    // создаем метод когда машину глушат
    void offCar();

    void distance(Car car, double time);

}
