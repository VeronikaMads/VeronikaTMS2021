package com.home.heir3;

import com.home.heir1.Air;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@Getter
@Setter
@SuperBuilder
public class Civil extends Air { // класс - Гражданский воздушный транспорт
    private int numbOfPassengers; // поле - количество пассажиров
    final boolean businessClass = true; // поле - наличие бизнес класса
}




