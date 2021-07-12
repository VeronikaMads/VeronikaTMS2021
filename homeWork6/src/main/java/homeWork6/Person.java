package homeWork6;

import homeWork6.Address;
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

    public Person(String s, String s1) {
    }


    @Override
    public String toString() {
        return "Person{" +
                "Address=" + myAddress +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}



