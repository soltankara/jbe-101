package session11;

import java.util.Arrays;

public class Library {
    private static Book[] books = new Book[100];
    private static int count = 0;

    public void addBook(Book book) {
        if (books.length < count) {
            books = Arrays.copyOf(books, books.length * 2);
        }
        books[count++] = book;
    }

    public void removeBook(int accountNumber) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < books.length; j++) {
                if (books[j] != null && books[j].getAccountNumber() == accountNumber) {
                    books[j] = null;
                    break;
                }
            }
        }
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
