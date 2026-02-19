package DataServicesClases.ex07;

import java.util.List;

public class Member {
    private String name;
    private List<Book> books;

    public Member(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public Member(String name) {
        this.name = name;
    }

    public Member(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
