package Module02.Session11.Homeworks.Ex11;

public class Book {
    //11. Write a Java program to create a class called "Library" with a collection of books and methods to add
    // and remove books.
    private final int id;
    private String name;
    private String author;
    private int year;
    private static int idCounter = 0;


    public Book(String name, String author, int year) {
        this.id = idCounter++;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void setIdCounter(int idCounter) {
        Book.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public static int getIdCounter() {
        return idCounter;
    }
}
