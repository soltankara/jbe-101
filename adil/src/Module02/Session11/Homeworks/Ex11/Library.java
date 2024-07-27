package Module02.Session11.Homeworks.Ex11;

public class Library {
    private final Book[] books = new Book[1000];
    private static int k = 0;

    public void add(Book... bookS) {
        for (Book book : bookS) {
            books[k++] = book;
        }
    }

    public void remove(int id) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getId() == id) {
                books[i] = null;
                break;
            }
        }
    }

    public void showLibrary() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

}
