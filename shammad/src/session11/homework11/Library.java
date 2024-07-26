package session11.homework11;

public class Library {
    private int index = 0;
    private Book[] books;

    public Library(int librarySize) {
        books = new Book[librarySize];
    }

    public void addBook(Book book) {
        if ((index > (books.length - 1)) || books[index]!=null) {
            System.out.println("Library has ran out of bookshelfs. Can not add another book.");
            return;
        }
        books[index] = book;
        index++;
    }

    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null)
                continue;
            if (books[i].equals(book)) {
                books[i] = null;
                index = i; //index points to empty index for availability of adding book
                return;
            }
        }
        System.out.println("The book does not exists in the library.\n");
    }

    public void listAllBooks() {
        System.out.println("Books in the library :");
        for (Book book : books) {
            if (book == null)
                continue;
            System.out.println(book);
        }
        System.out.println();
    }

    public Book[] getBooks() {
        return books;
    }
}
