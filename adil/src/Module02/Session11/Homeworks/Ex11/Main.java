package Module02.Session11.Homeworks.Ex11;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Marvel", "Stan Lee", 2000);
        Book book2 = new Book("Sherlock Holmes", "Sir Arthur", 2010);
        Book book3 = new Book("Sherlock Holmes", "Sir Arthur", 2011);
        Book book4 = new Book("Sherlock Holmes", "Sir Arthur", 2012);
        Book book5 = new Book("Sherlock Holmes", "Sir Arthur", 2013);
        library.add(book1, book2, book3, book4, book5);
        library.remove(1, 3);
        library.showLibrary();
    }
}
