package homeWork6;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Алеша";
        person.Address = new Address("Буларусь", "Брест");
        person.age = 25;
        System.out.println(person);
    }
    }

