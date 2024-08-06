package session11W3resourceOOP;
public class Library {
    private String[] books;
    private int countOfBooks;

    public Library(int maxCountOfBooks) {
        this.books = new String[maxCountOfBooks];
        this.countOfBooks = 0;
    }
    public void addBook(String book) {
        if (countOfBooks < books.length) {
            books[countOfBooks] = book;
            countOfBooks++;
            System.out.println(book + " added ");
        } else {
            System.out.println(book + "there is not enough place for book");
        }
    }
    public void removeBook(String book) {
        boolean found = false;
        for (int i = 0; i < countOfBooks; i++) {
            if (books[i].equals(book)) {
                found = true;
            }
            for (int j = i; j < countOfBooks - 1; j++) {
                books[j] = books[j + 1];
            }
            books[countOfBooks - 1] = null;
            countOfBooks--;
            System.out.println(book + " removed");
            break;

        }
        if (!found) {
            System.out.println(book + "was not found ");
        }
    }
    public void showLibraryInfo() {
        System.out.print("books :");
        for (int i = 0; i < countOfBooks; i++) {
            System.out.print(books[i] + "  ");
        }
        System.out.println();
    }
}
