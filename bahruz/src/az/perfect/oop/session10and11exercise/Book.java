package az.perfect.oop.session10and11exercise;

import java.util.ArrayList;
import java.util.List;

public class Book {

    //Exercise 5

    private static List<Book> bookList = new ArrayList<>();

    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public static List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
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

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public static void addBook(Book book) {
        bookList.add(book);
    }

    public static void removeBook(Book book) {
        bookList.remove(book);
    }

    @Override
    public String toString() {
        return "Book: { " + "title: " + title + "  ,author: " + author + " ,ISBN='" + ISBN + '}';
    }
}
