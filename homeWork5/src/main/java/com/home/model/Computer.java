package com.home.model
        //создаем конструктор

public class Computer {
    String processor; //процессор
    String ddr;  //оперативная память
    int ssd;  // жесткий диск
    int recurs;  // ресурс полных циклов работы (вкл/выкл)

    // добавляем метод описание(вывод всех полей)

    void info () {
        System.out.println(" Характеристика компьютера: Процессор %s ");

    }
}
