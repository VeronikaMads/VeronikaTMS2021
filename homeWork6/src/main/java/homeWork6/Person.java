package homeWork6;

import homeWork6.Address;
public class Person {
    public static final String MALE = "male";  // обьявляем константы
    public static final String FEMALE = "female"; // -//-
    public Object Address;
    Address address;
    String name;
    int age;
    String sex = FEMALE;

    public Person(String name, String city, String sex, int age, Address address) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.sex = sex;
        if (MALE.equals(sex) || FEMALE.equals(sex)){
            this.sex = sex;
        }
    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", sex='" + sex + '\'' +
                '}';
    }
}


