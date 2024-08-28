package az.turing.oop.library;

public class Book {

    private String name;
    private String author;
    private String ISBN;
    private int bookCount;

    public Book(String title, String author, String ISBN, int bookCount) {
        this.name = title;
        this.author = author;
        this.ISBN = ISBN;
        this.bookCount = bookCount;
    }

    public String getTitle() {
        return name;
    }

    public void setTitle(String title) {
        this.name = title;
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

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }
}
