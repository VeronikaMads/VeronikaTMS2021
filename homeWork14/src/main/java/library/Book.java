package library;

import lombok.Getter;
import lombok.ToString;

//* Для каждой книги библиотечного фонда известны автор, название и год издания.
@Getter
@ToString
public class Book {
    private String author;
    private String title;
    private int yearOfPublishing;
}
