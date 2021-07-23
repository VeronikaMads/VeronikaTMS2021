package p2;

import p1.Car;
import p1.FuelBak;

public interface Methods {
    //    Чтобы поехать, машину необходимо завести
    // создаем метод onCar
    public void onCar();

    //Чтобы машину завести нужно включить двигатель.
    // создаем метод onEngine
    public void onEngine();

    // создаем метод движения машины
    public void goesCar();

    // создаем метод когда машину глушат
    public void offCar();

    // создаем метод котрый показывает расстояние поездки за определенный период времени.
    public void distance(Car car, double time);

    // создаем метод проверки топлива в бензобаке
    public void checkFuel(FuelBak fuelTank);

    // создаем метод заправки топлива
    public void fuelFillingColumn(FuelBak fuelTank);
}
