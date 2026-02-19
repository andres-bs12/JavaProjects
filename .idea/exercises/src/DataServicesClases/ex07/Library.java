package DataServicesClases.ex07;

import java.util.List;

public class Library {
   private List<Member> members;
   private List<Book> books;

    public Library(List<Member> members, List<Book> books) {
        this.members = members;
        this.books = books;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
