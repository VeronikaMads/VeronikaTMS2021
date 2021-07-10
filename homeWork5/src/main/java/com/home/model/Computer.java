package com.home.model;
//создаем конструктор

import java.util.Random;
import java.util.Scanner;

public class Computer {
    public String processor; //процессор
    public String ddr;  //оперативная память
    public int ssd;  // жесткий диск
    public int recurs;  // ресурс полных циклов работы (вкл/выкл)

    // добавляем метод описание(вывод всех полей)
    public void info() {
        System.out.printf("Computer: processor - %s , ddr - %s , ssd - %d , recurs - %d \n", processor, ddr, ssd, recurs);
    }

    //добавляем метод метод включить (on/off)void on () {
    public void on() {
        System.out.println(" Внимание ! Введите число от 0 до 1 ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Random random = new Random();
        int code = random.nextInt(2);
        if (number == code) {
//            System.out.println("Компьютер выключается ");// если введенное вами число совпадет с рандомным, то компьютер выключается, вызывается метод off().
            off();
        } else {  //если введенное вами число не совпадет с рандомным, то компьютер сгорает.
            burn();
        }
    }

    // добавляем метод burn , компьтер сгорел.
    public void burn() {
 //       if (recurs = 0) {
            System.out.println("Компьютер сгорел");
        }
    }

    //  добавляем метод выключить (of())
    public void off() {
        if (recurs > 0) {
            recurs--;
            System.out.println("Компьютер выключается");
        } else { // если меньше 0 - сгорел
            burn();
        }
    }

}




