package p4;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;
@Getter
@Setter
public class InfoMethodicalAuthorization implements MethodicalAuthorization {
    private UserAccountInfo userAccountInfo;

    @Override
    public void checkAuthorization() {

    }

    @Override
    public void checkLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш логин. Логин может содержать только латинские буквы, цифры и знак подчеркивания.\n"+
                "Длина должна быть меньше 20 символов.");
        String login = "[a-zA-Z0-9_]";
        login = scanner.next();
        int len1 = login.length();
        if (len1 >= 20){
            System.out.println("Ошибка! Максимальное количество символов 19!");
        }
    }

    @Override
    public void checkupPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш пароль. Пороль должен содержать только латинские буквы, цифры и знак подчеркивания.\n" +
                "Длина password должна быть меньше 20 символов");
        String password = "[a-zA-Z0-9_]";
        password = scanner.next();
        int len2 = password.length();
        if (len2 >= 20) {
            System.out.println("Ошибка! Максимальное количество символов 19!");
        }
        String confirmPassword = null;
            try {
                if (confirmPassword == null)
                    throw new WrongPasswordException ();
                else (confirmPassword.equals(password)) {
                    System.out.println("Все верно! Пароли совпадают");
                } throw new  WrongPasswordException ("Пароли несовпадают!"){

                } cSystem.out.println("Пароли совпадают Регистрация удалась");

    }

        public void checkpointPassword() {

    }
}
//    boolean isStarted = true; // вводим перемунную при котором условие положильное (для того что бы выполнять операцию пока число не будет четное, т.е isStarted =true)
//        while (isStarted) { // переменная = true,пока..
//                try {
//                int number = random.nextInt(21); // вводим переменную и присваиваем значение от 0 до 20.
//                // перед входом, условия кторое может бросить исключение пишем try (дословно, попытайся)
//                if (number % 2 == 0) { //если рандомное число при делении на 2 не имеет остатка(четное число)
//                System.out.println("Число четное"); // выводим на консоль
//                } else { // если число нечетное
//                throw new Exception("Внимение! Рандомом выбрано нечетное число. Попробуйте еще раз"); //создаем собственное исключения при помощи оператора throw.
//                } //  исключение не вылетело, выводим на консоль сообщение что автомобиль завелся
//                System.out.println("Автомобиль " + machine.getBrandCar() + "  завелся");
//                isStarted = false; // // если перемення = false . возвращаемся в начало цикла, пока она не станет true
//                } catch (Exception e) { // ловим созданное нами исключение с помощью catch
//                System.out.println(e.getMessage()); //получаем текст из него через метод getMessage()
//                }
//                }