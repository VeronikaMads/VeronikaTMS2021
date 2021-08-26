package streamAPI;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Person {
    private String name;
    private String surname;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
