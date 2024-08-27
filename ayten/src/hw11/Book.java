package hw11;

public class Book {
    private final int id;
    private String name;
    private String author;
    private int year;
    private static int idCount = 0;

    public Book( String name, String author, int year) {
        this.id = idCount++;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setIdCounter(int idCount) {
        Book.idCount = idCount;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public static int getIdCounter() {
        return idCount;
    }

    public String getName() {
        return name;
    }
}
