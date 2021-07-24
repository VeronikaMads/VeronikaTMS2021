import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение катета a: ");
        int a = scanner.nextInt();
        System.out.print("Введите значение катета b: ");
        int b = scanner.nextInt();
        double result = (Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        System.out.println("Гипотенуза равна: " + result);
    }

}

