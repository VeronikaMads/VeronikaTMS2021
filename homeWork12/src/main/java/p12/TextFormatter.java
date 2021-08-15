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

    protected static boolean checkPalindrome(String[] strings1) {
        return Stream.of(strings1)
                .filter(s1 -> s1.length() > 1)
                .anyMatch(s1 -> new StringBuilder(s1).reverse().toString().equals(s1));
    }

    public boolean isPalindrome(String text) {
        String[] words = text.split(",\\s*");
        StringBuilder sb =new  StringBuilder (text);
        for (String word : words) {
            if (word.length() > 1 && sb.reverse().equals(word)) {
                return true;
            }
        }
        return false;
}}
