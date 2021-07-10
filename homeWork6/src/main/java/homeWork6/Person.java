package homeWork6;

import homeWork6.Address;
public class Person {
    public static final String MALE = "male";
    public static final String FEMALE = "female";
//    public static final String MM = "Constanta";
    String name;
    int age;
    private Address address;
    private String sex;

    public Person(String name, String city, String sex, int age, Address address) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.age = age;
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


