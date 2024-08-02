package session11;

import java.util.Arrays;

public class Book {
    private String title;
    private String author;
    private int accountNumber;

    public Book() {
    }

    public Book(String title, String author, int accountNumber) {
        this.title = title;
        this.author = author;
        this.accountNumber = accountNumber;
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

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
