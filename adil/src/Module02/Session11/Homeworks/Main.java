package Module02.Session11.Homeworks;

import Module02.Session11.Homeworks.Ex11.Book;
import Module02.Session11.Homeworks.Ex11.Library;
import Module02.Session11.Homeworks.Ex12.Airplane;
import Module02.Session11.Homeworks.Ex30.GymMembership;
import Module02.Session11.Homeworks.Ex30.PremiumMembership;

import java.lang.reflect.Array;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Marvel", "Stan Lee", 2000);
        Book book2 = new Book("Sherlock Holmes", "Sir Arthur", 2010);
        Book book3 = new Book("Sherlock Holmes", "Sir Arthur", 2011);
        library.add(book1, book2, book3);
//        library.remove(1);
        library.showLibrary();
    }
}
