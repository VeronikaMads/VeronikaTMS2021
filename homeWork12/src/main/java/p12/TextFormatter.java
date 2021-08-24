package p12;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter

//  * 1. Метод принимает строку и возвращает кол-во слов в строке.
public class TextFormatter {
    void checkLineCount(String str8) {
        String[] word = str8.split("\\s+");
        Long count = Stream.of(word)
                .collect(Collectors.counting());
        System.out.println("В тексте " + count + " слов");
    }

//    * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false

    // проверяет на наличие палиндрома
    private static boolean checkPalindrome(String[] str) {
        return Stream.of(str)
                .filter(s -> s.length() > 1)
                .anyMatch(s -> new StringBuilder(s).reverse().toString().equalsIgnoreCase(s));
    }


    //    возвращает true, если нет false
    public boolean isPalindromes(String str) {
        String[] strings = str.split("[.!?]"); // делит на предложения
        boolean result = false;
        if (checkPalindrome(str.split("[^А-Яа-я]"))) {
            result = true;
        }
        return result;
    }

    //   Метод Разбивает текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
//         * Если подходит, то выводим на экран.
    public static List<String> getSentencesContainsPalindromes(String str) {
        String[] sentences = str.split("[.!?]");//делим текст на предложения
        return Stream.of(sentences)
                .filter(s -> checkPalindrome(s.split("[^А-Яа-я]"))) //через сплит мы из предложения получаем массив слов(паттерн выбирает только русские символы и больше ничего)
                .collect(Collectors.toList());
    }
}


