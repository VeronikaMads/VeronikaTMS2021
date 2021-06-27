import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение: ");
        int numder = scanner.nextInt();
        if (numder > 0) {
            ++numder;
        }
        if (numder < 0) {
            numder = numder - 2;
        }
        if (numder == 0) {
            numder = 10;
        }
        System.out.println("Результат : " + numder);
    }
}

