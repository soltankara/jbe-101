package module2.session11;

public class BookMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("oscar collerde", "anar", 349344);
        Book book2 = new Book("oscar evde", "cosqun", 326234);
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook(326234);
        library.displayBooks();
    }
}
