package session11W3resourceOOP;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.author = author;
        this.isbn = isbn;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", isbn='" + isbn + '\'' + '}';
    }

    public static ArrayList<Book> bookCollection = new ArrayList<Book>();

    public static void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("book added : " + book);
    }

    public static void removeBook(Book book) {
        if (bookCollection.remove(book)) {
            System.out.println("book added : " + book);
        } else {
            System.out.println("book not found : " + book);
        }
    }

    public static void showBooks() {
        System.out.println("books in collection : ");
        for (Book book : bookCollection) {
            System.out.println(book);
        }
    }
}
