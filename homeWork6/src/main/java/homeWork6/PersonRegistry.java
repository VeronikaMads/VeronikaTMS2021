package homeWork6;

import java.util.Objects;

public class PersonRegistry {
    private Person[] cityzens; // создаем массив граждан (хранение данных о людях)

    public PersonRegistry(Person[] cityzens) {
        this.cityzens = cityzens;
    }

    // метод выводит количесвто людей проживающих в городе
    public int countPeopleAddress(Address address) {
        int count = 0;
        for (Person person : cityzens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCity().equals(address.getCity())
                    && personsAddress.getCountry().equals(address.getCountry())) {
                count++;
            }
        }
        return count;
    }

    // метод выводит количесвто людей с определенным именем.
    public int countPeopleName(String name) {
        int count = 0;
        for (Person person : cityzens) {
            String personsName = Person.getName();
            if (personsName.equals(name)) {
                count++;
            }
        }
        return count;
    }

    // метод выводит количесвто всех людей годных к службе в возросте от 18 до 27 лет.
    public int countPeopleAge(int age) {
        int count = 0;
        for (Person person : cityzens) {
            int personsAge = Person.getAge();
            if ((personsAge >= 18) && (personsAge <= 27)) {
                count++;
            }
        }
        return count;
    }

    // метод выводит количесвто всех людей годных к службе в возросте от 25 до 27 лет.
    public int countPeopleAges(int age, String sex) {
        int count = 0;
        for (Person person : cityzens) {
            int personsAges = Person.getAge();
            if ((personsAges >= 25) && (personsAges <= 27)) {
                count++;
            }
        }
        return count;

    }

    // метод выводит количесвто всех людей c мужским полом.
    public int countPeopleSex(String sex) {
        int count = 0;
        for (Person person : cityzens) {
            String personsSex = Person.getSex();
            if (personsSex.equals(Person.MALE)) {
                count++;
            }
        }
        return count;

    }
}






