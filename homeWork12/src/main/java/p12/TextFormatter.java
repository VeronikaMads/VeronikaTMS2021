package p12;

import lombok.Getter;
import lombok.Setter;

import java.util.stream.Collectors;
import java.util.stream.Stream;
//  * 1. Метод принимает строку и возвращает кол-во слов в строке.
public class TextFormatter {
    void checkLineCount(String str8) {
        String[] word = str8.split("\\s+");
        Long count = Stream.of(word)
                .collect(Collectors.counting());
        System.out.println("В тексте " + count + " слов");
    }

//    * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
    void checkPalindromesInLine(String str8){

    }
    void isPalindromes(String str8){
        String[] word = str8.split("[\\.\\!\\?]");
        new StringBuffer(str8);
        boolean isPalindromes = true;
        StringBuffer stringBuffer = new StringBuffer(str8);
        System.out.println(stringBuffer.reverse().toString().equals(str8));
    }
}
