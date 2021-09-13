package streamAPI;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Car {
    private String number;
    private int year;

    public Car(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public Car() {
    }
}
