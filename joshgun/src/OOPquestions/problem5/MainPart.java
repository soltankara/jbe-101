package OOPquestions.problem5;
/*Write a Java program to create a class called "Book" with attributes for title,
author, and ISBN, and methods to add and remove books from a collection.*/

import java.util.ArrayList;

public class MainPart {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", "3710820948");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "5594546451");

        Book.bookAdd(book1);
        Book.bookAdd(book2);

        ArrayList<Book> books = Book.getBooks();

        for (Book book : books) {
            System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getISBN());
        }

        System.out.println("\nAfter changing: \n");
        Book.bookRemove(book2);
        for (Book book : books) {
            System.out.println(book.getTitle() + " | " + book.getAuthor() + " | " + book.getISBN());
        }
    }
}
