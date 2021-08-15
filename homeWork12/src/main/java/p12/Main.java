package p12;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
@Getter
@Setter
@ToString
public class Main {
    public static void main(String[] args) {
        /**
         * 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
         * 2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
         * 3) В массиве находятся слова. Вывести на экран слова палиндромы (т.е которые читаются справа на лево и слева на право
         * одинаково, например: заказ, казак, дед...)
         * 4) Есть строка в которой содержится текст, предложения разделены точками. После запуска программы на экран должны
         * выводиться только те предложения в которых от 3-х до 5-ти слов.
         * Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится
         * на экран.
         * Пишем все в ООП стиле. Создаем класс TextFormatter
         * в котором два статических метода:
         * 1. Метод принимает строку и возвращает кол-во слов в строке.
         * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
         * В main создаем строку с текстом, также можно текст задавать с консоли.
         * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
         * Если подходит, то выводим на экран.
         */
        TextFormatter textFormatter = new TextFormatter();
//        1.substring(): возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса
        String str = "carbarcarbarcarbar";// +1 т.к. последний индекс не выводит. Особенность метода
        System.out.println(str.substring(str.indexOf("a"), str.lastIndexOf("b") + 1)); //arbarcarbarcarb
//        2.Метод charAt() — возвращает символ, расположенный по указанному индексу строки. Индексы строк в Java начинаются с нуля.
//        replace(): заменяет в строке одну подстроку на другую
        String str2 = "This website providing free tutorials";
        char result1 = str2.charAt(0);
        char result2 = str2.charAt(3);
        String str3 = str2.replace(result2, result1);
        System.out.println(str3);
//        3. 1 способ
        String str5 = "довод";
        String reverse = "";
        int length = str5.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + str5.charAt(i);
        if (str5.equals(reverse)) {
            System.out.println(" Is a palindrome.");
        } else
            System.out.println("Is not a palindrome.");
//        3.2 способ
        boolean isPalindrome = true;
        while (isPalindrome) {
            String str4 = "заказ";
            int i = str4.length() - 1;
            int j = 0;
            while (i > j) {
                if (str4.charAt(i) != str4.charAt(j)) {
                    isPalindrome = false;
                    System.out.println("Entered string is not a palindrome.");
                    break;
                }
                i--;
                j++;
            }
            System.out.println("Entered string is a palindrome.");
            break;
        }
//       3.3 способ
//       StringBuffer() — создаст пустой (не содержащий символов) объект
//       StringBuffer(String str) — создаст объект на основе переменной str (содержащий все символы str в той же последовательности)
        boolean isPalindromes = true;
        String str6 = "песня, казак";
        StringBuffer stringBuffer = new StringBuffer(str6);
        System.out.println(stringBuffer.reverse().toString().equals(str6));

//       3.4 способ
        String str7 = "Алла";//аллА
        String strReverse = new StringBuilder(str7).reverse().toString();
        if (str7.equalsIgnoreCase(strReverse)) {
            System.out.println(str7 + " является полиндром");
        } else {
            System.out.println(str7 + " не является полиндром");
        }

//        4) Есть строка в которой содержится текст, предложения разделены точками. После запуска программы на экран должны
//         * выводиться только те предложения в которых от 3-х до 5-ти слов.
//          Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится
//          на экран.

        final String text = "Пробудилась дед земля от долгого зимнего сна.Заблестела молодая травка." +
                "Разлилась волна зелёного тумана по широкому лугу.Стоят тёплые и тихие вечера.Звенят луга." +
                "По земле, по лугам, по оврагам плывёт звон.Что это звенит?Вот скатилась капля сладкого сока с берёзовой ветки.";
        String[] sentences = text.split("[.!?]");
        List<String> stringList = Stream.of(sentences)
                .map(s -> getSentencesByCondition(s))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(stringList);

//         * Пишем все в ООП стиле. Создаем класс TextFormatter
//         * в котором два статических метода:
//            * 1. Метод принимает строку и возвращает кол-во слов в строке.
//            * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
//         * В main создаем строку с текстом, также можно текст задавать с консоли.
//         * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
//         * Если подходит, то выводим на экран.

        final String str8 = "Разбежавшись, прыгну со скалы. Вот я был, и вот меня не стало. И когда об этом вдруг узнаешь ты. Тогда поймёшь, кого ты потеряла";
        String[] strings1 = str8.split(" ");
        textFormatter.checkLineCount(str8);
        textFormatter.isPalindrome(str8);

    }
    // соединяем в один метод
    private static String getSentencesByCondition(String text) {
        String[] strings = text.split(" ");
        if (checkLength(strings) || checkPalindrome(strings)) {
            return text;
        }
        return null;
    }

    // создаем метод проверки на палиндром
    private static boolean checkPalindrome(String[] strings) {
        return Stream.of(strings)
                .filter(s1 -> s1.length() > 1)
                .anyMatch(s -> new StringBuilder(s).reverse().toString().equals(s));
    }

    // создаем метод который возвращает t/f . Задаем длину
    private static boolean checkLength(String[] strings) {
        return strings.length >= 3 && strings.length <= 5;
    }
}












