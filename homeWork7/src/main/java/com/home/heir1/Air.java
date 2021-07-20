package com.home.heir1;

import com.home.parentClass.Transport;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class Air extends Transport { // класс Воздушынй
    private double wingspan; // поле - размах крыльев (м)
    private double runwayLength; // поле - Минимальная длина взлётно-посадочной полосы для взлёта (м)

    public Air(double power, double speed, double weight, String brand, double wingspan, double runwayLength) {
        super(power, speed, weight, brand);
        this.wingspan = wingspan;
        this.runwayLength = runwayLength;
    }


    public Air() {
        this(45000, 700, 50000, "Airbus A330-200", 60, 600);
        System.out.println("Air");
    }

}


