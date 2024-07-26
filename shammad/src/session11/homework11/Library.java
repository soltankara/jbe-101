package session11.homework11;

public class Library {
    private int index = 0;
    private Book[] books;
    private int bookCount = 0;

    public Library(int librarySize) {
        books = new Book[librarySize];
    }

    public void addBook(Book book) {
        if ((index > (books.length - 1)) || books[index] != null) {
            System.out.println("Library has ran out of bookshelfs. Can not add %s".formatted(book.getName()));
            return;
        }
        books[index] = book;
        index++;
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
