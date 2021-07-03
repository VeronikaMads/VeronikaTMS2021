import javax.imageio.spi.ImageInputStreamSpi;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(ameba(new int[]{3, 6, 9, 12, 15, 18, 21, 24}));
 //       summa();
        ImageInputStreamSpi();
    }
    //  1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    public static int ameba(int []ints){
        int count =0;
        for (int i = 1; i < ints.length ; i++) {


        }
    }


    // 2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
// умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
//    public static void summa() {
//        int a = 5;
//        int b = 6;
//        int sum = a * b;
//        {
//            System.out.println(sum);
//
//        }
//    }
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
        int mass[][]=new int[4][4];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if ()
                System.out.printf("%5d", mass[i][j]);
            }
            System.out.println();
        }

}


}

