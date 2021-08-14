package p4;

// Создание собственного класса исключения WrongPasswordException
public class WrongPasswordException extends Exception {

//  двa конструктора – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super("Пароли несовпадают");
    }
}
