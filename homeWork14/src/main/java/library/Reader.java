package library;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//* Для читателя библиотеки будем хранить ФИО и электронный адрес. Каждый читатель может взять в библиотеке одну или несколько книг.
@Getter
@Setter

public class Reader {
    private String fio; //ФИО
    private String email; // электронный адрес
    private boolean acceptance; //флаг согласия на рассылку
    private List<Book> books; //взятые книги

    public Reader(String fio, String email, boolean acceptance) {
        this.fio = fio;
        this.email = email;
        this.acceptance = acceptance;
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Reader reader = (Reader) o;
        return fio.equals(reader.fio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fio);
    }
}