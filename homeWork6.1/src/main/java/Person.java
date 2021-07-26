import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class Person {
//    private enum sex {
//        MALE,FEMALE
//    }
//    private Enum sex;

    private String name;
    public static final String MALE = "male";  // обьявляем константы
    public static final String FEMALE = "female"; // -//-
    private String sex = FEMALE;
    private int age;
    private Address myAddress;

}

