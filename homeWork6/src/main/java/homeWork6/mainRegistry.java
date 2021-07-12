package homeWork6;

import java.util.ArrayList;
import java.util.Arrays;

public class mainRegistry {
    public static void main(String[] args) {
        // создаем список людей и передаем их в PersonRegistry
//        ArrayList<Person> people = new ArrayList<Person>();
        Person[] people = new Person[7];
        for (Person person :people) {
            {
                Person person1 = new Person(" Паша", "MALE", 15, new Address("Минск", "Беларусь"));
                people[0] = person1;
            }
            {
                Person person2 = new Person(" Миша", "MALE", 27, new Address("Брест", "Беларусь"));
                people[1] = person2;
            }
            {
                Person person3 = new Person(" Дима", "MALE", 34, new Address("Минск", "Беларусь"));
                people[2] = person3;
            }

            {
                Person person4 = new Person(" Олег", "MALE", 15, new Address("Гродно", "Беларусь"));
                people[3] = person4;
            }

            {
                Person person5 = new Person(" Андрей", "MALE", 22, new Address("Витебск", "Беларусь"));
                people[4] = person5;
            }

            {
                Person person6 = new Person(" Женя", "MALE", 18, new Address("Минск", "Беларусь"));
                people[5] = person6;
            }

            {
                Person person7 = new Person(" Максим", "MALE", 25, new Address("Минск", "Беларусь"));
                people[6] = person7;
            }
            System.out.println(person);
        }
        PersonRegistry registry = new PersonRegistry();
    }

}
