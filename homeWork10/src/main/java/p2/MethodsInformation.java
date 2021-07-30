package p2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import p1.CarMethods;
import p1.Machine;


import java.util.Random;



@Getter
@Setter
@AllArgsConstructor
public class MethodsInformation implements CarMethods {
    private Machine machine;

    @Override
    public void start(Machine machine) { //Создать метод старт в котором пытаетесь завести автомобиль
        Random random = new Random(); // обьявлем рондом который будет генирировать числа
        int number = random.nextInt(21); // вводим переменную и присваиваем значение от 0 до 20.
        int i = 0;
        while (i++ < 1) {
            try {  // перед входом, условия кторое может бросить исключение пишем try (дословно, попытайся)
                if (number % 2 == 0) { //если рандомное число при делении на 2 не имеет остатка(четное число)
                    System.out.println("Число четное"); // выводим на консоль
                } else { // если число нечетное
                    throw new Exception("Внимение! Рандомом выбрано нечетное число. Попробуйте еще раз"); //создаем собственное исключения при помощи оператора throw.
                } // ловим созданное нами исключение с помощью catch
            } catch (Exception e) {
                System.out.println(e.getMessage()); //получаем текст из него через метод getMessage()
                break; // если выпадает исключение на консоль ничего не выводится , пробуем еще раз..
            }
            //  исключение не вылетело, выводим на консоль сообщение что автомобиль завелся
            System.out.println("Автомобиль " + machine.getBrandCar() + "  завелся");
        }
    }
}



















