package streamAPI;

import org.apache.commons.lang3.StringUtils;

import java.util.*;
import java.util.stream.Stream;

import static java.lang.String.*;
import static java.util.Collections.*;

public class MethodsMain {

    void getListOfNumbers() {
       ArrayList<Integer> randomList = new ArrayList<Integer>();
       Random random = new Random();
       for (int i = 0; i < 10; i++) {
           randomList.add(random.nextInt(30));
       }
       System.out.println("Созданный рандомно список: "+randomList);
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

 //       StringUtils.capitalize(Str); Он работает только для строк, которые еще не написаны заглавными буквами.
//    void checkListNames() {
//        List<String> names = Arrays.asList("john", "arya", "sacha","katya","gleb");
//        Stream.of(names)
//                .map(StringUtils.capitalize(names))
//                .sorted()
//                .forEach(System.out::println);
//
//    }


}

