package session11.homework11;

public class Library {
    private Book[] books;
    private int bookCount = 0;

    public Library(int librarySize) {
        books = new Book[librarySize];
    }

    public void addBook(Book book) {
        if (bookCount > (books.length - 1)) {
            System.out.printf("Library has ran out of bookshelfs. Can not add %s\n", book.getName());
            return;
        }
        books[bookCount] = book;
        bookCount++;
    }

    public void removeBook(Book book) {
        boolean exists = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].equals(book)) {
                exists = true;

                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[bookCount - 1] = null;
                bookCount--;
                break;
            }
        }
        System.out.println((exists) ? "Element removed." : "Element does not exists.");
    }

    public void listAllBooks() {
        System.out.println("Books in the library :");

        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }

        System.out.println();
    }

    public Book[] getBooks() {
        return books;
    }
}
