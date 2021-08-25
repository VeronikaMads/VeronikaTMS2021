package streamAPI;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CarMain {
    private  String number;
    private  int year;

    public CarMain(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public CarMain() {
    }
}
