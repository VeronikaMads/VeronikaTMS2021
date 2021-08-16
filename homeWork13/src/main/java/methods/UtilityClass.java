package methods;

import java.util.Scanner;

@lombok.experimental.UtilityClass
public class UtilityClass {

    public static int readNewPrice (String message, int limits) {
        Scanner scanner = new Scanner(System.in);
        int price;
        do {
            System.out.println(message);
            while (!scanner.hasNextDouble()) {
                System.out.println("Введенное не является числом!");
                scanner.next();
            }
            price =scanner.nextInt();
        } while (priceLimits(price,limits));
        return price;

    }

    public static String readNewName(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    private static boolean priceLimits(int price, int limits) { // прописываем ограничения цены
        if (price < 1 || price > limits){
            System.out.println("Цена введена неверно!");}
        return price < 1 || price > limits;
    }
}