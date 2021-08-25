package streamAPI;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PersonMain {
    private String name;
    private String surname;

    public PersonMain() {
    }

    public PersonMain(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
