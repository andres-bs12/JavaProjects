package DataServicesClases.ex07;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book("Harry Potter", 50, 2, 0);
        Book book2 = new Book("Titanic", 30, 8, 4);

        Member member1 = new Member("Andres");
        Member member2 = new Member("Andres", List.of(book1, book2));

        Library lib1 = new Library(List.of(member1, member2), List.of(book1, book2));

        LibraryService service = new LibraryService();

        System.out.println(member2.getName() + " Owns " + service.calculateFine(member2) +  "$");
        System.out.println(member1.getName() + "Owns " + service.calculateFine(member1) +  "$");

        List<String> booksToBeChanged = service.getBooksToBeChanged(lib1);
        System.out.println("There are " + booksToBeChanged.size() + " to be changed: " + booksToBeChanged);
    }


}
