import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Person {
    public static final String MALE = "male";  // обьявляем константы
    public static final String FEMALE = "female"; // -//-
    private Address myAddress;
    private String name;
    private int age;
    private String sex = FEMALE;

    public Person(String name, String sex, int age, Address address) {
        this.name = name;
        this.myAddress = address;
        this.age = age;
        this.sex = sex;
        if (MALE.equals(sex) || FEMALE.equals(sex)){
            this.sex = sex;
        }
    }

    public Address getAddress() {
        return myAddress;
    }

}
