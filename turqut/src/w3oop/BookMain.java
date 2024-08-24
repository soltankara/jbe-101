package turqut.src.w3oop;

import java.util.ArrayList;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Little Prince", "Mark Twen", "101234543");
        Book book2 = new Book("Chess", "Stefan Zweig", "102235544");

        Book.addBook(book1);
        Book.addBook(book2);

        ArrayList<Book> bookCollection = Book.getBookCollection();

        System.out.println("Our collection is : ");

        for (Book book : bookCollection) {
            System.out.printf(String.format("%s by %s with %s ISBN number", book.getTitle(), book.getAuthor(), book.getISBN()));
            System.out.println();
        }

        Book.removeBook(book1);

        System.out.printf(String.format("Our collection after removing %s : ", book1.getTitle()));
        System.out.println();

        for (Book book : bookCollection) {
            System.out.printf(String.format("%s by %s with %s ISBN number", book.getTitle(), book.getAuthor(), book.getISBN()));
            System.out.println();
        }

    }
}