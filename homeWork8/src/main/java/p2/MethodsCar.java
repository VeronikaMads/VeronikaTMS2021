package p2;

public interface MethodsCar {
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
    public void distance();

    public void calculationFuel(double time);

}
