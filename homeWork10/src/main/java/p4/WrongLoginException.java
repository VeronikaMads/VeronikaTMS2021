package p4;

// Создание собственного класса исключения WrongLoginException
public class WrongLoginException extends Exception {

    //  двa конструктора – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
