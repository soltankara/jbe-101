package hw11;

import java.util.Arrays;

public class Library {
    private final Book[] books = new Book[1000];
    private static int k = 0;
//    public Book[] add(Book array, Book book){
//        Book newArray = Arrays.copyOf(array, array.length + 1);
//        newArray[newArray.length - 1] = book;
//        must be fixed this code
//    }
public void add(Book... bookS){
    for (Book book : bookS) {
        books[k++] = book;
    }
}
    public void remove(int id){
        for (int i = 0; i < books.length; i++) {
            if(books[i].getId() == id) {
                books[i] = null;
                break;
            }

        }
    }
    public void showLibrary(){
        for (Book book : books) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
