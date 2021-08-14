package p4;

import java.util.Scanner;
import java.util.regex.Pattern;

public interface MethodicalAuthorization {
    //объявляю константу в интерфейсе, потому что все его поля итак уже public static final (Можно было созать отдельный класс или интефейс с контантами..но надо ли ?)
    final static String ERROR_MESSAGE = "Поле не соответствует требованиям: поле должно содержать:\n" +
            "- только латинские буквы, цифры и знак подчеркивания.Длина поля должна быть от 8 до 20 символов.";
    final static String MESSAGE_LOGIN = "Поле Login должно содержать:\n" +
            "- только латинские буквы, цифры и знак подчеркивания. Длина login должна быть от 8 до 20 символов.";
    final static String MESSAGE_PASSWORD = "Поле Password должно содержать:\n" +
            "- только латинские буквы, цифры и знак подчеркивания. Длина login должна быть от 8 до 20 символов.";
    final static String MESSAGE_REGISTRATION = "Регистрация прошла успешно!";
    final static String ERROR_CONFIRM_PASSWORD_MESSAGE = "Поле Password и confirmPassword не совпадают";
    Scanner scanner = new Scanner(System.in);
    //поиск совпадений с шаблоном будет производиться без учета регистра символов.
    Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

    void checkLogin();

    void checkupPassword();

    void checkpointPassword(String confirmPassword);

}

