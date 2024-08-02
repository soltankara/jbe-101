package Module02.Session11.Homeworks.Ex11;

import java.util.Arrays;

public class Library {
    private Book[] books = new Book[2];
    private static int k = 0;

    public void add(Book... bookS) {
        for (Book book : bookS) {
            if (k == books.length) {
                books = Arrays.copyOf(books, books.length * 2);
            }
            books[k++] = book;
        }
    }

    public void remove(int... ids) {
        for (int id : ids) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null && books[i].getId() == id) {
                    books[i] = null;
                    break;
                }
            }
        }
    }
    public void showLibrary() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
