package session11;

public class Book {
    private int[] books = new int[100];
    private int count = 0;
    private String title;
    private String author;
    private int ISBN;
    public Book() {}
    public Book(String title, String author, int ISBN, int[] books, int count) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.books = new int[100];
        this.count = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int[] getBooks() {
        return books;
    }

    public void setBooks(int[] books) {
        this.books = books;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addBook() {
        for (int i = 0; i < this.books.length; i++) {
            books[count]++;
        }
        System.out.println("the book is added");
    }
    public void removeBook() {
        for(int i = 0; i < books.length; i++) {
            books[count]--;
        }
        System.out.println("the book is removed");
    }
    public void displayBooks(){
        if(books == null) {
            System.out.println("no books found");
        }
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
