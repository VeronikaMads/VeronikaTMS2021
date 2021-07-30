package p1;
import p2.MethodsInformation;
import p3.Audi;
import p3.Hyundai;
import p3.Nissan;

public class Main {
    public static void main(String[] args) {
        //  Домашка.
        //1) Можно добработать свой авто из 8 домашки, а можно заново сделать.
        //Создать собственное исключение.
        //- Создать класс Car c полями (марка, скорость, цена), конструкторы (с параметрами и default) гетеры-сетеры.
        //Создать метод старт в котором пытаетесь завести автомобиль. В методе старт генерируете случайное число от 0 до 20,
        // если полученное число оказалось четным, то выбрасываете созданное ранее вами исключение
        // и передаете его к месту откуда вызывали метод старт. Если все хорошо и исключение не вылетело,
        // то выводить в консоль сообщение что автомобиль с такой-то маркой завелся.
        //В main создаете парочку автомобилей и пытаетесь их завести.
        // И обрабатываете исключение которое может вылететь при старте автомобиля

        Machine audi = new Audi("Audi C 50", 120,45000);
        Machine hyundai = new Hyundai("Hyundai CсH 558", 125,55000);
        Machine nissan = new Nissan("Nissan К484", 130,49000);
        MethodsInformation methodsInformation = new MethodsInformation(audi);
        MethodsInformation methodsInformation1 = new MethodsInformation(nissan);
        MethodsInformation methodsInformation2 = new MethodsInformation(hyundai);
        methodsInformation.start(audi);
        methodsInformation.start(nissan);
        methodsInformation.start(hyundai);

    }
}
