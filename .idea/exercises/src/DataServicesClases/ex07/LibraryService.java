package DataServicesClases.ex07;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    public int calculateFine(Member member) {
        int totalDelayedDays = 0;
        if (member != null && member.getBooks() != null) {

            for (Book book : member.getBooks()) {
                totalDelayedDays += book.getDelayedDays();
            }
        } return (totalDelayedDays * 2);
    }


    public List<String> getBooksToBeChanged(Library library) {
        List<String> booksToBeChanged = new ArrayList<>();

        if (library != null && library.getBooks() != null) {
            for (Book book : library.getBooks()) {
                if (book.getBorrows() > 50 || book.getState() > 7) {
                    booksToBeChanged.add(book.getName());
                }
            }
        }
        return booksToBeChanged;
    }

}


