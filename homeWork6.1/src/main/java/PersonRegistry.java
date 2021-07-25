
public class PersonRegistry {
    private Person[] citizens; // создаем массив граждан (хранение данных о людях)

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    // метод выводит количесвто людей проживающих в городе
    public int findPersonsByCity(String city) {
        System.out.println("Метод выводит количесвто людей проживающих в городе:");
        int count = 0;
        for (Person person : citizens) {
            Address personsAddress = person.getMyAddress();
            if (personsAddress.getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }

    // метод выводит количесвто людей с определенным именем.
    public int findPersonsByName(String name) {
        System.out.println("Метод выводит количесвто людей с определенным именем:");
        int count = 0;
        for (Person person : citizens) {
            String personsName = person.getName();
            if (personsName.equals(name)) {
                count++;
            }
        }
        return count;
    }

    // метод выводит имена всех людей годных к службе в возросте от 18 до 27 лет.
    public void findPersonsByNameAge() {
        System.out.println("Метод выводит имена всех людей годных к службе в возросте от 18 до 27 лет:");
        for (Person person : citizens) {
            int personsAge = person.getAge();
            if (personsAge >= 18 && personsAge <= 27 && person.getSex().equalsIgnoreCase(Person.MALE)) {
                System.out.println(person.getName());
            }
        }
    }

    // метод выводит количесвто всех людей годных к службе в возросте от 25 до 27 лет.
    public int findPersonsByAge25to27() {
        System.out.println("Метод выводит количесвто всех людей годных к службе в возросте от 25 до 27 лет:");
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






