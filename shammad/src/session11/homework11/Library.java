package session11.homework11;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void listAllBooks() {
        System.out.println("Books in the library :");
        books.forEach(System.out::println);
        System.out.println();
    }

    public List<Book> getBooks() {
        return books;
    }
}
