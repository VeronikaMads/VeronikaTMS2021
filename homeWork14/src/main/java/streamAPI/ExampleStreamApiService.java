package streamAPI;
import org.apache.commons.lang3.StringUtils;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.List.of;

public class ExampleStreamApiService {
    Person person;

    public void getListOfNumbers() {
        List<Integer> randomList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomList.add(random.nextInt(30));
        }
        System.out.println("Созданный рандомно список: " + randomList);
        randomList.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList()); //что бы вернуть список чисел
    }

    {

        List<Integer> randomList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomList.add(random.nextInt(30));
            System.out.println("Созданный рандомно список: " + randomList);
        }
    }

    public static List<Integer> checkEvenNumbers() {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            integers.add(random.nextInt(100));
        }
        System.out.println("Set of Integer: " + integers);
        return integers.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
    }

    // 2 способ
    public static void checkEvenNumbers2() {
        ArrayList<Integer> integers2 = new ArrayList<Integer>();
        Random random2 = new Random();
        for (int i = 0; i < 50; i++) {
            integers2.add(random2.nextInt(100));
        }
        System.out.println("Set of Integer: " + integers2);
        integers2.stream()
                .filter(i2 -> i2 % 2 == 0)
                .map(String::valueOf) //тут мы преобразовали инт в стринг.
                .collect(Collectors.joining(","));//тут собрали в строку все значения через запятую
        System.out.println("New set of Integer: " + integers2);
    }

    //      StringUtils.capitalize(Str); Он работает только для строк, которые еще не написаны заглавными буквами.
    public void checkListNames() {
        List<String> names = Arrays.asList("john", "arya", "sacha", "katya", "gleb");
        names.stream()
                .map(StringUtils::capitalize)
                .sorted()
                .forEach(System.out::println);

    }

    public static List<Car> getCarsList() {
        return of(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

    }

    public void getCars(List<Car> getCarsList) {
        getCarsList.stream()
                .filter(carMain -> carMain.getYear() > 2010)
                .map(Car::getNumber)
                .filter(StringUtils::isNotBlank)
                .forEach(System.out::println);
    }
    // не совсем поняла как выполнить последний пункт "вернуть объект Optional<String>"

    public void getPersonsByParams(List<Person> personList, String param) {
        personList.stream()
                .filter(p -> p.getSurname().startsWith(param))
                .map(Person::getSurname)
                .filter(StringUtils::isNotBlank)
                .forEach(System.out::println);
    }

    //  последний пункт "вернуть объект Optional<String>"
    public void getPersonsByParams2(List<Person> personList, String param) {
        Optional.of(personList.stream()
                .map(Person::getSurname)
                .filter(surname -> surname.startsWith(param))
                .filter(StringUtils::isNotBlank)
                .collect(Collectors.joining(",")));
    }

    // задача со звездой

    public Map<String, Long> getPersonsSort(List<Person> getPersonsList) {
        return getPersonsList.stream()
                .map(Person::getSurname)
                .map(name -> name.substring(0, 1))
                .collect(Collectors.groupingBy(let -> let, Collectors.counting()));
    }

}




