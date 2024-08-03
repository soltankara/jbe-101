package az.perfect.oop.session10and11exercise;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Exercise 1
        Person person = new Person("Sanan", 22);
        System.out.println("He is " + person.getName() + ",he is " + person.getAge() + " old");
        Person person1 = new Person("Ali", 25);
        System.out.println("My name is " + person1.getName() + " and I'm " + person1.getAge());
        System.out.println();


        //Exercise 2
        Dog dog = new Dog("Rex", "american");
        dog.setName("Buddy");
        dog.setBreed("italian");
        System.out.println("This is an " + dog.getName() + " and its name is " + dog.getName());
        System.out.println();

        //Exercise 3
        Rectangle rectangle = new Rectangle(5.6, 8.5);
        double area = rectangle.areaOfRectangle();
        double perimeter = rectangle.perimeterOfRectangle();
        System.out.println("Area: " + area + " , Perimeter: " + perimeter);
        System.out.println();

        //Exercise 4
        Circle circle = new Circle();
        circle.setRadius(5.5);
        double areaOfCircle = circle.areaOfCircle(circle.getRadius());
        System.out.println("Area: " + areaOfCircle);
        System.out.println();


        //Exercise 5
        Book book1 = new Book("Java Language", "Memmet Kirazli", "2400869");
        Book book2 = new Book("Atommic habbits", "James Clear", "14500447");

        Book b = new Book();
        List<Book> bookList = b.bookList;
        bookList.add(book1);
        bookList.add(book2);

        for (Book book : bookList) {
            System.out.println(book);
        }
        bookList.remove(book1);

        for (Book book : bookList) {
            System.out.println(book);
        }



        System.out.println();

        //Exercise 6
        BankTeller bankTeller = new BankTeller("Murad Ahmadov", "Senior Fronted Developer", 3500);
        bankTeller.salaryOfIncreasedTeller(9);
        System.out.println(bankTeller);
        System.out.println();


        //Exercise 7
        Account account1 = new Account("Ayhan A", "446239", 8341.6);
        Account account2 = new Account("Ahmed D", "446440", 5341.6);

        BankAccount bankAccount = new BankAccount();

        List<Account> accountList = bankAccount.getAccountList();
        accountList.add(account1);
        accountList.add(account2);

        //Accountlari görmek
        for (Account account : accountList) {
            System.out.println(account.getAccountInfo());
        }
        System.out.println();


        //account silmek
        accountList.remove(account2);
        //Accountlari görmek
        for (Account account : accountList) {
            System.out.println(account.getAccountInfo());
        }
        System.out.println();


        //account elave etmek
        accountList.add(account2);
        //Accountlari görmek
        for (Account account : accountList) {
            System.out.println(account.getAccountInfo());
        }
        System.out.println();

        //Balansdan pul çək
        account1.setBalance(account1.getMoney(500));
        //yenidən accountları görmək
        for (Account account : accountList) {
            System.out.println(account.getAccountInfo());
        }
        System.out.println();

        //balansa pul elave etmek
        account2.setBalance(account2.addMoney(700));
        //yenidən accountları görmək
        for (Account account : accountList) {
            System.out.println(account.getAccountInfo());
        }


    }
}
