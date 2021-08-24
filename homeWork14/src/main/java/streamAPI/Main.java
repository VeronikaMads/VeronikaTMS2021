package streamAPI;

import org.apache.commons.lang3.StringUtils;
import org.intellij.lang.annotations.Language;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//     * Все задачи необходимо решать используя Stream API и выводить результат на консоль !!!
//                * 1) Вывести список чисел, умноженных на 2. Список чисел задаем рандомно.
        MethodsMain methodsMain = new MethodsMain();
        methodsMain.getListOfNumbers();

//      * 2) Определение количества четных чисел в потоке данных.
//      * Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
        methodsMain.checkEvenNumbers();

//      * 3) Вывести список имен, но с первой заглавной буквой. список имен: "john", "arya", "sansa"


//      * 4) Создаем класс Car с полями number (номер авто) и year (год выпуска).
        List<CarMain> cars = Arrays.asList(
                new CarMain("AA1111BX", 2007),
                new CarMain("AK5555IT", 2010),
                new CarMain(null, 2012),
                new CarMain("", 2015),
                new CarMain("AI3838PP", 2017));
//     * Необходимо вывести все не пустые номера машин, выпущенных после 2010 года
        cars.stream()
                .filter(carMain -> carMain.getYear()>2010)
                .map(CarMain::getNumber)
                .filter(carMain->carMain != null && !carMain.isEmpty())
                .forEach(System.out::println);


//     * 5) Задан список сотрудников, которые хранятся в коллекции List<Person>.
//     * Объект Person содержит имя и фамилию(по желанию другие данные)
//     *  a) написать метод, который отображает все фамилии, начинающиеся на букву "Д".
//     *  Внимание! метод должен вернуть объект Optional<String>.
//     *  b*)Со звездочкой. Написать метод, который будет выводить в столбик первую букву фамилии и рядом количество сотрудников,
//     *  у которых фамилия начинается с этой буквы.
//     *  Пример: Антонов, Петров, Сидоров, Александров...
//     *  на экран выведет:
//     *  A - 2 сотрудника
//                *  П - 1 сотрудник
//                *  С - 1 сотрудник
    }

}
