package library;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//* Для читателя библиотеки будем хранить ФИО и электронный адрес. Каждый читатель может взять в библиотеке одну или несколько книг.
@Getter
@ToString
public class Reader {
    private String fio; //ФИО
    private EmailAddress email; // электронный адрес
    private boolean acceptance; //флаг согласия на рассылку
    private List<Book> books; //взятые книги

    public Reader(String fio, EmailAddress email, boolean acceptance) {
        this.fio = fio;
        this.email = email;
        this.acceptance = acceptance;
        this.books = new ArrayList<>();
    }
}

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass())
//            return false;
//        Reader reader = (Reader) o;
//        return fio.equals(reader.fio);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(fio);
//    }
//}