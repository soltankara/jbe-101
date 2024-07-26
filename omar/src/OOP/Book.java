package OOP;

public class Book {
    private String title;
    private String[] collection;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setCollection(String[] collection) {
        this.collection = collection;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void Add(String title){
        collection[collection.length] = title;
    }
    public String getCollection(){
        for (int i = 0; i < collection.length; i++) {
            System.out.println(collection[i]);
        }
        return  collection[collection.length-1];
    }

}
