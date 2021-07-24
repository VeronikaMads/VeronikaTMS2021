import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonRegistry {
    private Person[] citizens; // создаем массив граждан (хранение данных о людях)

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    // метод выводит количесвто людей проживающих в городе
    public int countPeopleAddress(Address address) {
        int count = 0;
        for (Person person : citizens) {
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
        for (Person person : citizens) {
            String personsName = person.getName();
            if (personsName.equals(name)) {
                count++;
            }
        }
        return count;
    }

    // метод выводит количесвто всех людей годных к службе в возросте от 18 до 27 лет.
    public int countPeopleAge() {
        int count = 0;
        for (Person person : citizens) {
            int personsAge = person.getAge();
            if (personsAge >= 18 && personsAge <= 27 && person.getSex().equalsIgnoreCase(Person.MALE)) {
                count++;
            }
        }
        return count;
    }

    // метод выводит количесвто всех людей годных к службе в возросте от 25 до 27 лет.
    public int countPeopleAges() {
        int count = 0;
        for (Person person : citizens) {
            int personsAges = person.getAge();
            if (personsAges >= 25 && personsAges <= 27 && person.getSex().equalsIgnoreCase(Person.MALE)) {
                count++;
            }
        }
        return count;
    }
}


