package library;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

//* Для читателя библиотеки будем хранить ФИО и электронный адрес. Каждый читатель может взять в библиотеке одну или несколько книг.
@Getter
@ToString
public class Reader {
    private String surname;
    private String name;
    private String patronymic; // отчество
    private String email;
    private String acceptance; //флаг согласия на рассылку
    private ArrayList<Book> Readable = new ArrayList<Book>();

    public Reader(String surname, String name, String patronymic, String email, String acceptance) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.email = email;
        this.acceptance = acceptance;
    }

}
