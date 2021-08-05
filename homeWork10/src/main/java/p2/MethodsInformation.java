package p2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import p1.MachineMethods;
import p1.Machine;


import java.util.Random;



@Getter
@Setter
@AllArgsConstructor
public class MethodsInformation implements MachineMethods {
    private Machine machine;

    public MethodsInformation() {

    }

    @Override
    public void start(Machine machine) { //Создать метод старт в котором пытаетесь завести автомобиль
        Random random = new Random(); // обьявлем рондом который будет генирировать числа
        boolean isStarted = true; // вводим перемунную при котором условие положильное (для того что бы выполнять операцию пока число не будет четное, т.е isStarted =true)
        while (isStarted) { // переменная = true,пока..
            try {
                int number = random.nextInt(21); // вводим переменную и присваиваем значение от 0 до 20.
                // перед входом, условия кторое может бросить исключение пишем try (дословно, попытайся)
                if (number % 2 == 0) { //если рандомное число при делении на 2 не имеет остатка(четное число)
                    System.out.println("Число четное"); // выводим на консоль
                } else { // если число нечетное
                    throw new Exception("Внимение! Рандомом выбрано нечетное число. Попробуйте еще раз"); //создаем собственное исключения при помощи оператора throw.
                } //  исключение не вылетело, выводим на консоль сообщение что автомобиль завелся
                System.out.println("Автомобиль " + machine.getBrandCar() + "  завелся");
                isStarted = false; // // если перемення = false . возвращаемся в начало цикла, пока она не станет true
            } catch (Exception e) { // ловим созданное нами исключение с помощью catch
                System.out.println(e.getMessage()); //получаем текст из него через метод getMessage()
            }
        }
    }
}



















