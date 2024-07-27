package Session11;

public class Book {
   private String title;
   private String author;
   private int ISBN;


   public Book(String title,String author,int ISBN){
       this.title=title;
       this.author=author;
       this.ISBN=ISBN;

   }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;

    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }}

