import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение катета a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение катета b: ");
        int b = scanner.nextInt();
        int result = ((a * a) + (b * b));
        System.out.println("Гипотинуза равна: " + result);
    }

}

