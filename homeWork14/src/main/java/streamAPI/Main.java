package streamAPI;


import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.List.*;
import static streamAPI.ExampleStreamApiService.*;

public class Main {
    public static void main(String[] args) {
//     * Все задачи необходимо решать используя Stream API и выводить результат на консоль !!!
//      * 1) Вывести список чисел, умноженных на 2. Список чисел задаем рандомно.
        ExampleStreamApiService methodsMain = new ExampleStreamApiService();
        methodsMain.getListOfNumbers();

//      * 2) Определение количества четных чисел в потоке данных.
//      * Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
        System.out.println(checkEvenNumbers());
        System.out.println(" *** ");
        checkEvenNumbers2();
//      * 3) Вывести список имен, но с первой заглавной буквой. список имен: "john", "arya", "sansa"
        methodsMain.checkListNames();

//      * 4) Создаем класс Car с полями number (номер авто) и year (год выпуска).
//     * Необходимо вывести все не пустые номера машин, выпущенных после 2010 года
        methodsMain.getCars(getCarsList());


//     * 5) Задан список сотрудников, которые хранятся в коллекции List<Person>.
//     * Объект Person содержит имя и фамилию(по желанию другие данные)
//     *  a) написать метод, который отображает все фамилии, начинающиеся на букву "Д".
//     *  Внимание! метод должен вернуть объект Optional<String>.

        //тестовые данные которые не должны храниться в сервисе - выносим их в main
        System.out.println("__________________");
        methodsMain.getPersonsByParams(PersonList(), "W");
        System.out.println("_______этот метод не работает___________");
        methodsMain.getPersonsByParams2(PersonList(),"W");
        System.out.println("__________________");
//        methodsMain.getPersonsByParams3(PersonList(),"W");

//     *  b*)Со звездочкой. Написать метод, который будет выводить в столбик первую букву фамилии и рядом количество сотрудников,
//     *  у которых фамилия начинается с этой буквы.
//     *  Пример: Антонов, Петров, Сидоров, Александров...
//     *  на экран выведет:
//     *  A - 2 сотрудника
//                *  П - 1 сотрудник
//                *  С - 1 сотрудник

        Map<String, Long> countSurname = methodsMain.getPersonsSort(PersonList());
        for (Map.Entry<String, Long> entry : countSurname.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
        public static List<Person> PersonList () {
            return of(
                    new Person("Jessie", "Smith"),
                    new Person("Rosy", "Wilson"),
                    new Person("Jenny", "Parson"),
                    new Person("Barbie", "Flatcher"),
                    new Person("Annie", "Gilbert"),
                    new Person("Barbie", "Winston"));
        }

}
