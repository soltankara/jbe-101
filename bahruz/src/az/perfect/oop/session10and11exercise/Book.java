package az.perfect.oop.session10and11exercise;

import java.util.ArrayList;
import java.util.List;

public class Book {

    //Exercise 5

    List<Book> bookList = new ArrayList<>();

    public Book() {
    }

    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
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


    @Override
    public String toString() {
        return "Book: { " + "title: " + title + "  ,author: " + author + " ,ISBN='" + ISBN + '}';
    }

}
