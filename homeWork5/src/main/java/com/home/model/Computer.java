package com.home.model;
//создаем конструктор

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

@Getter
@Setter
public class Computer {
    private final String processor; //процессор
    private final int ddr;  //оперативная память
    private final int ssd;  // жесткий диск
    private final int recursOfCycles;  // ресурс полных циклов работы (вкл/выкл)

    private int cycles = 0; // цикл перезапуска
    private boolean burn = false; // сгорел ли комьпютер?
    private boolean isOn = false; // включен ли компьютер ?
    Scanner scanner = new Scanner(System.in); // запускаем сканер

    public Computer(String processor, int ddr, int ssd, int recursOfCycles) {
        this.processor = processor;
        this.ddr = ddr;
        this.ssd = ssd;
        this.recursOfCycles = recursOfCycles;
    }

    // добавляем метод описание(вывод всех полей)
    public void info() {
        System.out.printf("Computer: processor - %s , ddr - %s , ssd - %d , recursOfCycles - %d \n", processor, ddr, ssd, recursOfCycles);
    }

    //добавляем метод метод включить (on) {
    public void on() {
        if (!burn) { // проверяем не сожжен ли компьютер, если нет то..
            System.out.println(" Включение.."); // компьютер включается
            System.out.println(" Внимание ! Введите число от 0 до 1 ");
            Random random = new Random(); // создаем рандом
            int number = scanner.nextInt();
            int code = random.nextInt(2);
            if (number == code) { // проверяем введеные данные с полученным рандомом,если введенное вами число совпадет с рандомным
                System.out.println("Компьютер включен ");// то компьютер включается, вызывается метод off().
                off();
            } else {  //если введенное вами число не совпадет с рандомным, то компьютер сгорает.
                burn = true;
            }
            isOn = true;{
                System.out.println("Компьютер сгорел");
            }
        }
    }


//          добавляем метод выключить (of())
        public void off () {
            if (!burn) { //проверяем не сожжен ли компьютер, если нет то..
                System.out.println("Выключение...");
                System.out.println(" Внимание ! Введите число от 0 до 1 ");
                Random random = new Random(); // создаем рандом
                int number = scanner.nextInt();
                int code = random.nextInt(2);
                if (number == code) //проверяем введеные данные с полученным рандомом,если введенное вами число совпадет с рандомным то
                System.out.println(" Компьютер выключен");
                if (isOn){ // Проверяем включен ли был компьютер
                    cycles++; // если да то увеличиваем счетччик количества включения-выключения
                    isOn = false;
                    if (cycles == recursOfCycles){
                        burn = true;
                    } else {
                        System.out.println(" Компьютер сгорел");
                    }
                }// Проверяем включен ли был для этого компьютер
            }
        }

}






