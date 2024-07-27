package Session11;

public class BookCollection {
        private Book[] books;
        private int count;

        public BookCollection(int maxSize) {
            books = new Book[maxSize];
            count = 0;
        }
        public void addBook(String title, String author, int ISBN) {
            if (count < books.length) {
                books[count] = new Book(title, author, ISBN);
                count++;
                System.out.println("New book added: " + title);
            } else {
                System.out.println("The list is full, a new book cannot be added");
            }
        }
        public void removeBook(int ISBN) {
            for (int i = 0; i < count; i++) {
                if (books[i].getISBN() == ISBN) {
                    System.out.println("Book deleted: " + books[i].getTitle());
                    books[i] = books[count - 1]; // Silinəni sonuncu ilə əvəz et
                    books[count - 1] = null; // Sonuncunu boşalt
                    count--;
                    return;
                }
            }
            System.out.println("Book not found: ISBN " + ISBN);
        }
}
