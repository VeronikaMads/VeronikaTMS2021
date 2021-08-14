package p4;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class InfoMethodicalAuthorization implements MethodicalAuthorization {
    private UserAccountInfo userAccountInfo;


    @Override
    public void checkLogin() {
        // Метод matches() — в Java сообщает, соответствует ли или нет данная строка заданному регулярному выражению.
        System.out.println(MESSAGE_LOGIN);
        // Метод matches() — в Java сообщает, соответствует ли или нет данная строка заданному регулярному выражению.
        String login = scanner.next();
        if (login.matches("\\w,{10,20}")) {
            System.out.println("Ваш логин принят!");
        } else { // если условие логина не выполняется
            try { //попытайся
                throw new WrongLoginException(); // выбрасываем исключение
            } catch (WrongLoginException e) { // ловим искл. + выводим смс об ошибке
                System.out.println(ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void checkupPassword() {
        System.out.println(MESSAGE_PASSWORD);
        String password = scanner.next();
        if (password.matches("\\w,{10,20}")) {
            System.out.println("Ваш пароль принят!");
        } else {
            try {
                throw new WrongPasswordException(); // выбрасываем исключение
            } catch (WrongPasswordException e) { // ловим искл. + выводим смс об ошибке
                System.out.println(ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void checkpointPassword(String confirmPassword) {
        if (userAccountInfo.getPassword() == confirmPassword) {
            System.out.println(MESSAGE_REGISTRATION);
        } else {
            try {
                throw new WrongPasswordException(); // выбрасываем исключение
            } catch (WrongPasswordException e) { // ловим искл. + выводим смс об ошибке
                System.out.println(ERROR_CONFIRM_PASSWORD_MESSAGE);
            }
        }
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