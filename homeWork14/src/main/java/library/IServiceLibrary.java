package library;

import java.util.ArrayList;
import java.util.List;

public interface IServiceLibrary {
 //   *  a) Получить список всех книг библиотеки, отсортированных по году издания.
    public void doWithoutLambda(Library library);

//       б) Требуется создать список рассылки (объекты типа EmailAddress) из адресов всех читателей библиотеки.
//       При этом флаг согласия на рассылку учитывать не будем:
//       библиотека закрывается, так что хотим оповестить всех.
    public void getListDistribution(Library library);
//      в) Снова нужно получить список рассылки. Но на этот раз включаем в него только адреса читателей,
//       которые согласились на рассылку.
//       Дополнительно нужно проверить, что читатель взял из библиотеки больше одной книги.
    public void getListDistribution2(Library library);
}
