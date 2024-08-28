package az.turing.oop.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList;
    private List<Reader> readerList;



    public Library() {
        this.bookList =new ArrayList<>();
        this.readerList = new ArrayList<>();
    }

    //Kitab elave etmek
    public void addBook(Book book) {
        bookList.add(book);
    }

    //Oxuyucu elave et
    public void addReader(Reader reader) {
        readerList.add(reader);
    }

    //Kitab götürmek
    public void getBorrowBook(String ISBN,String readerId) {

        for (Book book : bookList) {
            if (book.getISBN().equals(ISBN) && book.getBookCount() > 0) {
                for (Reader reader : readerList) {
                    if (reader.getId().equals(readerId)) {
                        book.setBookCount(book.getBookCount() - 1);
                        System.out.println("Alınan kitab: " + book.getTitle());
                        return;
                    } else {
                        System.out.println("Oxuyucu tapılmadı!!!");
                        return;
                    }
                }


            } else {
                System.out.println("Kitab tapılmadı və ya mövcud deyil!!!");
                return;

            }

        }

    }

    //kitab qaytarmaq
    public void returnBook(String readerId, String ISBN) {
        for (Book book : bookList) {
            if (book.getISBN().equals(ISBN)) {
                for (Reader reader : readerList) {
                    if (reader.getId().equals(readerId)) {
                        book.setBookCount(book.getBookCount() + 1);
                        System.out.println("Kitab qaytarıldı: " + book.getTitle());
                        return;
                    } else {
                        System.out.println("Oxuyucu tapılmadı.");
                        return;
                    }
                }

            } else {
                System.out.println("Kitab tapılmadı.");
                return;
            }
        }

    }

    public void listBooks() {
        for (Book book : bookList) {
            System.out.println("BookName: " + book.getTitle() + " ,Author: " + book.getAuthor() +
                    " ,ISBN: " + book.getISBN() + " ,bookCount: " + book.getBookCount());
        }
    }

    public void listReaders() {
        for (Reader reader : readerList) {
            System.out.println("ReaderID: " + reader.getId() + " ,ReaderName: " + reader.getName());
        }
    }

}
