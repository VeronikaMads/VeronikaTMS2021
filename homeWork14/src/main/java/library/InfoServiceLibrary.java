package library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InfoServiceLibrary implements IServiceLibrary {
    @Override
    public void doWithoutLambda(Library library) {
        List list = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getYearOfPublishing))
                .collect(Collectors.toList());
    }

    @Override
    public void getListDistribution(Library library) {
        List<EmailAddress> addresses = new ArrayList<>();
        for (Reader reader : library.getReaders()) {
            addresses.add(new EmailAddress(reader.getEmail()));
    }
//        {
//            List<EmailAddress> addresses1 = library.getReaders().stream()
//                    .map(Reader::getEmail)
//                    .map(EmailAddress::new)
//                    .collect(Collectors.toList());
//        }
    }


}
