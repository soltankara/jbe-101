package Task_day_3;

public class Book {
    public static void main(String[] args) {
        String title = "Cinayet ve Ceza";      // Kitabın başlığı
        String publishingHouse = "Qanun";
        String topicType = "Dram";  // Janr
        String author = "F. Dostoyevski";     // Yazar
        int publishingYear = 2024;
        int pageCount = 643;     // Sehife sayi
        String isbn = "1902312912353"; // ISBN nomresi
        long priceQpk = 1_100L;        // Qiymet (qepikle)
        boolean available = true; // Movcut olup olmadığı;
        //----------------------------------------------//
        System.out.println("Book title :" + title);
        System.out.println("Publishing House :" + publishingHouse);
        System.out.println("Topic type (genre) :" + topicType);
        System.out.println("Author :" + author);
        System.out.println("Publishing year :" + publishingYear);
        System.out.println("Page count :" + pageCount);
        System.out.println("ISBN no. :" + isbn);
        System.out.println("Price :" + priceQpk);
        System.out.println("Available  :" + available);


    }
}

