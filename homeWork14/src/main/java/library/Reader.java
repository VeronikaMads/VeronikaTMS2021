package library;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

//* Для читателя библиотеки будем хранить ФИО и электронный адрес. Каждый читатель может взять в библиотеке одну или несколько книг.
@Getter
@ToString
public class Reader {
    private String surname;
    private String name;
    private String patronymic; // отчество
    private EmailAddress email;
    private boolean acceptance; //флаг согласия на рассылку
    private List<Book> readableBooks = new ArrayList<Book>();

    public Reader(String surname, String name, String patronymic, EmailAddress email, boolean acceptance) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.email = email;
        this.acceptance = acceptance;
    }

    public Reader(List<Book> readableBooks) {
        this.readableBooks = readableBooks;
    }
}
