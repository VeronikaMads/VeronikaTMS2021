package library;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

//* Для каждой книги библиотечного фонда известны автор, название и год издания.
@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Book {
    private String author;
    private String title;
    private Integer yearOfPublishing;
}
