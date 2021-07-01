import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
//        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
//        for (int i = 0; i < 1000; i++) {
//            countDevs(i);}
//        for (int i = 0; i < 1000; i++) {
//            dd(i);
//        foobar(6);
//        foobar(10);
//        foobar(15);
//        calculateSumOfDiagonalElements();
        printMatrix();
    }

//    На вход приходит массив целых чисел типа int
//  Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
//  в котором это значение распечатается на консоль.

//    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
//        int count = 0;
//        for (int i : ints) {
//            if (i % 2 != 0) {  // Если при делении i на 2 остаток не равняется 0 - count ++ (неч.числа) (i%2 == 0) - четные
//                count++;
//            }
//        }
//        return count;
//    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */

//    private static void countDevs(int count) {
//        int c100 = count % 100;
//        int c10 = c100 % 10;
//        if (c100 >= 11 && c100 <= 19) {
//            System.out.println(count + " программистов");
//        } else if (c10 >= 2 && c10 <= 4){
//            System.out.println(count + " программиста");
//        } else if (c10 == 1){
//            System.out.println( count+ " программист");
//        } else {
//            System.out.println(count+ " программистов");
//
//        }
//
//    }
//    private static void dd(int count) {
//        if (count >0) {
//            if (count % 100 >=11 && count % 100<=14) {
//                System.out.println(count+ " программистов");
//            } else {
//                switch (count % 10){
//                    case 0:
//                    case 5:
//                    case 6:
//                    case 7:
//                    case 8:
//                    case 9: {
//                        System.out.println(count + "программистов");
//                        break;
//                    }
//                    case 1:{
//                        System.out.println(count+ " программист");
//                    }
//                    case 2:
//                    case 3:
//                    case 4:{
//                        System.out.println(count+ " программиста");
//                    }
//
//                }
//            }
//
//        } else {
//            System.out.println("Отрицательного числа программистов не существует");
//        }
//
//    }
    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
//    public static void foobar(int number) {
//        if (number % 3 == 0){
//            System.out.println(number+ " foo");
//        }else if (number % 5 ==0){
//            System.out.println(number+ " bar");
//        } else if (number % 3 ==0 && number % 5 ==0){
//            System.out.println( number+ " foobar");
//        }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
//    public static void calculateSumOfDiagonalElements() {
//        int[][] mass = new int[4][4];
//        Random random = new Random();
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length; j++) {
//                mass[i][j] = random.nextInt(60);
//            }
//        }
//        int sum = 0;
//        for (int i = 0; i < mass.length; i++) {
//            for (int j = 0; j < mass[i].length; j++) {
//                System.out.printf("%5d", mass[i][j]);
//                if (i == j) {
//                    sum += mass[i][j];
//                }
//            }
//            System.out.println();
//        }
//        System.out.println("Сумма по диагонали " + sum);
//    }



    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остато
     *             к от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        int a = scanner.nextInt();
        System.out.println("Введите значение b: ");
        int b = scanner.nextInt();
        int mass[][] = new int[a][b];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(100);
                System.out.printf("%5d", mass[i][j]);
            }
            System.out.println();
        }
        for (int[] ints : mass) {
            for (int anInt : ints) {
                if (anInt % 3 == 0) {
                    System.out.print(" + ");
                } else if (anInt % 7 == 0) {
                    System.out.print(" - ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }

}














