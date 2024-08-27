package hw11;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book b1 = new Book("On the Origin of Species", "Charles Darwin", 1990);
        Book b2 = new Book("Lord Of The Rings", " J. R. R. Tolkien", 1999);
        Book b3 = new Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", 1997);
        Book b4= new Book("The Hobbit","J. R. R. Tolkien",1937);
        library.add(b1, b2, b3,b4);
        library.remove(2);
        library.showLibrary();
//        Question 11



    }
}