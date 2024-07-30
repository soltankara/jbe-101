package session11;

public class BookMain {
    public static void main(String[] args) {
        int[] bookArray = new int[100];
        Book book1 = new Book("anar", "Oscar Wilde", 24, bookArray, 354);
        book1.addBook();
        book1.removeBook();
    }
}
