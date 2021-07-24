import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        int amoeba = 1;
        kolichectvoAmeb(amoeba);
        summa(3,4);
 //       summRec(4,5);
        ImageInputStreamSpi();
        printMatrix();
        ArraySort();
        Array1();
        Array2();
        Array3();
        Arrays4();
        Arrays5();

    }
    //  1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    public static void kolichectvoAmeb(int amoeba) {
        for (int i = 0; i < 24; i += 3) {
            amoeba = amoeba * 2;
            System.out.print(amoeba+ "  " );
        }
    }

//     2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
// умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.

    public static void summa(int a, int b) {
        int result = 0;
        if (a != 0 || b != 0) {
            int A = Math.abs(a);
            int B = Math.abs(b);
            for (int i = 0; i < B; i++) {
                result = result + A;

            }
            if (a > 0 ^ b > 0) {
                result = result - result;
            }
        }
        System.out.println(result);
    }

//    public static int summRec(int a, int b) {
//        if (a ==0 || b==0) {
//            return 0;
//        }
//        if ( a < 0 && b < 0);{
//            a = -a;
//            b = -b;
//        } if ( b < 0){
//            return b + summRec(b, --a);
//        }
//        return a+ summRec(a, b <0 ? ++b : --b);
//        }




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
        } else if (a < 0) {
            System.out.println(a + " - это отрицательное число ");
        } else {
            System.out.println("Вы ввели 0 . Введите положительное или отрицательное число ");
        }

        System.out.println((Math.abs(a) + " ").length());
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
        for (int i = mass.length-1; i >=0 ; i--) {
            System.out.printf("%5d", i);

        }
    }

//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    public static void Array1() {
        int[] mass = new int[12];
        int max = 15;
        int maxIndex = 0;
        Random random = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(16);
            System.out.printf("%5d", mass[i]);
            if (mass[i] >= max) {
                max = mass[i];
                maxIndex = i;
            }

        }
        System.out.println("  ");
        System.out.println("Индекс максимального элемента: " + maxIndex);
        System.out.println("Значение максимального элемента: " + max);
    }

//        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    public static void Array2() {
        int[] mass1 = new int[20];
        Random random = new Random();
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = random.nextInt(21);
            System.out.print(mass1[i] + "  ");
            if (i % 2 != 0) {
                mass1[i] = 0;
            }

        }
        System.out.println("  ");
        System.out.println(Arrays.toString(mass1));
    }

//        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    public static void Array3() {
        int[] mass3 = {4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int MAX = Integer.MIN_VALUE;
        int indexMAX = -1;
        for (int i = 0; i < mass3.length; i++) {
            if (mass3[i] > MAX) {
                MAX = mass3[i];
                indexMAX = i;
                System.out.println(" " + MAX);
            }
        }
    }



//        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

    public static void Arrays4(){

    }


//        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

    public static void Arrays5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк : ");
        int a = scanner.nextInt();
        System.out.println("Введите количество столбцов : ");
        int b = scanner.nextInt();
        int[][] mass5 = new int[a][b];
        Random random = new Random();
        for (int i = 0; i < mass5.length; i++) {
            for (int j = 0; j < mass5.length; j++) {
                mass5[i][j] = random.nextInt(51);
                System.out.print(mass5[i][j] + "  ");
            }
            System.out.println("\n");
        }
        int transpmass [][] = new int[a][b];
        for (int i = 0; i < mass5.length; i++) {
            for (int j = 0; j < mass5.length; j++) {
                transpmass [i][j] = mass5[i][j];
                mass5[j][i] = transpmass[j][i];
                System.out.print(transpmass[j][i]+ "  ");
            }
            System.out.println("\n");
        }

    }

}











