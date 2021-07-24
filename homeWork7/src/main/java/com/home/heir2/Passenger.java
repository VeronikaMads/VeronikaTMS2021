package com.home.heir2;

import com.home.heir1.Terrestrial;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder

public class Passenger extends Terrestrial { // класс Легковой
    private String bodyType; // поле - Тип кузова
    private int numberOfPassengers; // поле - Количество пассажиров

}
