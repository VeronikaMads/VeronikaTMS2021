
public class PersonRegistry {
    private Person[] citizens; // создаем массив граждан (хранение данных о людях)

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    // метод выводит количесвто людей проживающих в городе
    public void findPersonsByCity(String city) {
        int count = 0;
        for (Person person : citizens) {
            Address personsAddress = person.getMyAddress();
            if (personsAddress.getCity().equals(city)) {
                count++;
            }
        }
        System.out.println("Метод выводит количесвто людей проживающих в городе: " + count);
    }

    // метод выводит количесвто людей с определенным именем.
    public void findPersonsByName(String name) {
        int count = 0;
        for (Person person : citizens) {
            String personsName = person.getName();
            if (personsName.equals(name)) {
                count++;
            }
        }
        System.out.println("Метод выводит количесвто людей с определенным именем: " +count);
    }

    // метод выводит имена всех людей годных к службе в возросте от 18 до 27 лет.
    public void findPersonsByNameAge() {
        for (Person person : citizens) {
            int personsAge = person.getAge();
            if (personsAge >= 18 && personsAge <= 27 && person.getSex().equalsIgnoreCase(Person.MALE)) {
                System.out.println(person.getName());
            }
            System.out.println(person.getName() );
        }
    }

    // метод выводит количесвто всех людей годных к службе в возросте от 25 до 27 лет.
    public void findPersonsByAge25to27() {
        int count = 0;
        for (Person person : citizens) {
            int personsAges = person.getAge();
            if (personsAges >= 25 && personsAges <= 27 && person.getSex().equalsIgnoreCase(Person.MALE)) {
                count++;
            }
        }
        System.out.println("метод выводит количесвто всех людей годных к службе в возросте от 25 до 27 лет: "+count);
    }

}






