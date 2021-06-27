import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int lenght = scanner.nextInt();
        int[] mass = new int[lenght];
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < lenght; i++) {
            mass[i] = scanner.nextInt();
        }
        System.out.print("Введите значения массива: ");
        for (int i = 0; i < lenght; i++) {
            System.out.print("" + mass[i]);
        }
    }
}

