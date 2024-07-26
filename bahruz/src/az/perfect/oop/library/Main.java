package az.perfect.oop.library;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        //Kitablar elave et
        Book book1 = new Book("Java Programing language", "Mehmet Kirazli", "12458099", 5);
        Book book2 = new Book("Atomic Habbits", "James Clear", "204809639", 15);
        library.addBook(book1);
        library.addBook(book2);

        //Kitabları görmək
        System.out.println("All Books: ");
        library.listBooks();

        //Oxuyucu elave etmek
        Reader reader1 = new Reader("Sanan", "24");
        Reader reader2 = new Reader("Ayxan", "13");
        library.addReader(reader1);
        library.addReader(reader2);

        //Oxuyucuları görmək
        System.out.println("\nAll Readers: ");
        library.listReaders();

        System.out.println();

        //Kitab almaq
        library.getBorrowBook("12458099", "24");

        System.out.println();

        //Kitablari yeniden siyahi et
        library.listBooks();

        System.out.println();

        //Kitabi qaytarmaq
        library.returnBook("24", "12458099");

        System.out.println();

        //Kitablari yeniden siyahi et
        library.listBooks();


    }
}
