import javax.imageio.spi.ImageInputStreamSpi;
import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        kolichectvoAmeb(1);
        summa(3, 4);
        ImageInputStreamSpi();
        printMatrix();
        ArraySort();
        Array1();
    }
    //  1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    public static int kolichectvoAmeb(int ameoba) {
        for (int i = 0; i < 24; i += 3) {
            ameoba = ameoba * 2;
            System.out.println(ameoba);
        }
    }


//     2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
// умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

    public static void summa(int a, int b) {
        int sum = (a * b);
        System.out.println(sum);
    }

//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

    public static void ImageInputStreamSpi() {
        int mass[][] = new int[4][4];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println(" \n ");
        }
    }

//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

    public static void printMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение a: ");
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println(a + " - это положительное число ");
        } else {
            System.out.println(a + " - это отрицательное число ");
        }
        System.out.println((a + "").length());
    }


//        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

    public static void ArraySort() {
        int mass[] = new int[100];
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.printf("%5d", i);
            }
//            Arrays.sort(i);
//            System.out.println(Arrays.toString());
        }
        System.out.println(" ");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.printf("%5d", i);

        }
    }

//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    public static void Array1() {
        int[] mass = new int[12];
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(15);
            System.out.printf("%5d", mass[i]);
            int maxIndex = 0;
            if (mass[i] > mass[maxIndex]) {
                maxIndex = i;
            }
            System.out.printf("%5d", maxIndex);
        }

    }
}











