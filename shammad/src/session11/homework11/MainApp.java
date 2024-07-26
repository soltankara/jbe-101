package session11.homework11;

/*
11. Write a Java program to create a class called "Library" with a collection of books
    and methods to add and remove books.
*/
public class MainApp {
    public static void main(String[] args) {
        Library library = new Library(5);

        Book book1 = new Book("To Kill a Mockingbird (Paperback)", "Harper Lee");
        Book book2 = new Book("The Midnight Library (Hardcover)", "Matt Haig");

        library.addBook(book1);
        library.addBook(book2);

        library.listAllBooks();

        System.out.println("Removing '%s' book from library\n".formatted(book1.getName()));
        library.removeBook(book1);

        library.listAllBooks();
    }
}
