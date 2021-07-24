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
public class Military extends Air { //Военный воздушный транспорт
    final boolean ejectionSystem = true; // поле - наличае системы катапультирования (true/false)
    private int missile; // количесвто ракет на борту
}
