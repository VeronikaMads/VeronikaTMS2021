package streamAPI;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.*;
import static java.util.Collections.*;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MethodsMain {

    void getListOfNumbers() {
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomList.add(random.nextInt(30));
        }
        System.out.println("Созданный рандомно список: " + randomList);
        randomList.stream()
                .map(i -> i * 2)
                .forEach(System.out::println); //«справочник по методу»
    }


    // этот вариант метода не работает не выводит список отфильтрованный...вроде должен работать..

//    public static List<Integer> checkEvenNumbers() {
//        ArrayList<Integer> integers = new ArrayList<Integer>();
//        Random random = new Random();
//        for (int i = 0; i < 50; i++) {
//            integers.add(random.nextInt(100));
//        }
//        System.out.println("Set of Integer: " + integers);
//        return integers.stream()
//                .filter(i -> i % 2 == 0)
//                .collect(Collectors.toList());

    public static void checkEvenNumbers() {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            integers.add(random.nextInt(100));
        }
        System.out.println("Set of Integer: " + integers);
        integers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
        // не могу понять как из этого System.out::println - вывести результат в строку, через запятую..
    }

    //      StringUtils.capitalize(Str); Он работает только для строк, которые еще не написаны заглавными буквами.
    void checkListNames() {
        List<String> names = Arrays.asList("john", "arya", "sacha", "katya", "gleb");
        names.stream()
                .map(StringUtils::capitalize)
                .sorted()
                .forEach(System.out::println);

    }

    public static List<CarMain> getCarsList() {
        return List.of(
                new CarMain("AA1111BX", 2007),
                new CarMain("AK5555IT", 2010),
                new CarMain(null, 2012),
                new CarMain("", 2015),
                new CarMain("AI3838PP", 2017));

    }

    public void getCars(List<CarMain> getCarsList) {
        getCarsList.stream()
                .filter(carMain -> carMain.getYear() > 2010)
                .map(CarMain::getNumber)
                .filter(StringUtils::isNotBlank)
                .forEach(System.out::println);
    }
    // не совсем поняла как выполнить последний пункт "вернуть объект Optional<String>"


    public static List<PersonMain> getPersonsList() {
        return List.of(
                new PersonMain("Jessie", "Smith"),
                new PersonMain("Rosy", "Wilson"),
                new PersonMain("Jenny", "Parson"),
                new PersonMain("Barbie", "Flatcher"),
                new PersonMain("Annie", "Gilbert"),
                new PersonMain("Barbie", "Wilson"));
    }

    public void getPersons(List<PersonMain> getPersonsList) {
        getPersonsList.stream()
                .filter(p -> p.getSurname().startsWith("W"))
                .forEach(System.out::println);
    }

    // с этим методом проблемы...

//    public void getPersonsSort(List<PersonMain> getPersonsList) {
//        Map<String, List<PersonMain>> personType = getPersonsList.stream()
//                .collect(groupingBy(p -> p.substring(0, 1), counting()))
//                .forEach(System.out::println);
//    }
}


