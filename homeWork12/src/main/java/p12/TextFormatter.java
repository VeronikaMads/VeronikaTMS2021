package p12;

import lombok.Getter;
import lombok.Setter;

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

    private static boolean checkPalindrome(String str8) {
        String[] sentences = str8.split("[.!?]");
        return Stream.of(sentences)
                .filter(s -> s.length() > 1)
                .anyMatch(s -> new StringBuilder(s).reverse().toString().equalsIgnoreCase(s));
    }

    public boolean isPalindromes(String str8) {
        boolean result = false;
        String[] strings = str8.split(" ");
        if (checkPalindrome(str8)) {
            result = true;
        }
        return result;
    }
}

