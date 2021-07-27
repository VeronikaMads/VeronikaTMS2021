import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение: ");
        int numder = scanner.nextInt();
        if (numder > 0) {
            ++numder;
        } else if (0 > numder) {
            numder = numder - 2;
        } else if (numder == 0) {
            numder = 10;
        }
        System.out.println("Результат : " + numder);
    }
}
/**
 * На вход приходит массив целых чисел типа int
 * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
 * в котором это значение распечатается на консоль.
 */
//    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
//        int count = 0;
//        for (int i : ints) {
//            if (i % 2 != 0) {  // Если при делении i на 2 остаток не равняется 0 - count ++ (неч.числа) (i%2 == 0) - четные
//                count++;
//            }
//        }
//        return count;
//    }
