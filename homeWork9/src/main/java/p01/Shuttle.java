package p01;

import java.util.Random;

    //Создаем класс Шатл. Шатл реализует интерфейс IStart
public class Shuttle implements IStart{

    //  В методе предстартовой проверки генерируем случайное число в диапазоне от
    //  0 до 10. Если сгенерированное число больше 3-х то проверка прошла успешно. Если нет - не успешно.
    @Override
    public boolean check() {
        Random generate = new Random();
        return generate.nextInt(11) > 3;
    }
    // В методе запуска двигателей выводим строку в консоль «Двигатели Шатла запущены. Все системы в норме.»
    @Override
    public void ignition() {
        System.out.println("Двигатели Шатла запущены.\nВсе системы в норме.");
    }
    // В методе старт выводим строку в консоль. «Старт Шатла»
    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
