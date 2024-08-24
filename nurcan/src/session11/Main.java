package session11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1 -->Person.java
        Person one = new Person("Mira", 22);
        Person two = new Person("Miran", 23);
        System.out.println("person 1 name " + one.getName() + ", age " + one.getAge());
        System.out.println("person 2 name " + two.getName() + ", age " + two.getAge());
        //2 -->Dog.java
        Dog dog1 = new Dog("Rex", "Bernese Mountain Dog");
        Dog dog2 = new Dog("Garip", "German Shepherd");
        System.out.println("dog1 name and breed: " + dog1.getName() + ", " + dog1.getBreed());
        System.out.println("dog2 name and breed: " + dog2.getName() + ", " + dog2.getBreed());
        System.out.println("New variables:");
        dog1.setName("Rocky");
        dog2.setBreed("Rottweiler");
        System.out.println("dog1 name and breed: " + dog1.getName() + ", " + dog1.getBreed());
        System.out.println("dog2 name and breed: " + dog2.getName() + ", " + dog2.getBreed());
        //3-->Rectangle.java
        Rectangle rec = new Rectangle(3, 5);
        System.out.println("The area of rectangle: " + rec.getWidth() * rec.getHeight());
        //4-->Circle.java
        Circle circle = new Circle(2.7);
        double pi = 3.14;
        System.out.println("Area of the circle: " + pi * Math.pow(circle.getRadius(), 2));
        System.out.println("Circumference of the circle: " + 2 * pi * circle.getRadius());
        //5-->Book.java
        Book[] books = new Book[5];
        int bookCount = 0;
        bookCount = addBook(books, bookCount, "1984", "George Orwell", "0123456");
        bookCount = addBook(books, bookCount, "To Kill a Mockingbird", "Harper Lee", "0123457");
        System.out.print("Enter the name of the book to be deleted: ");
        String title = scan.next();
        bookCount = removeBook(books, bookCount, title);
        System.out.println("Books in the library: ");
        displayBooks(books, bookCount);
        //6-->Employee.java
        Employee emp = new Employee("Harry", "BackEnd Developer", 1300);
        emp.raiseSalary(7);
        System.out.println("name: " + emp.getName() + ", job title: " + emp.getJobTitle() + ", salary: " + emp.getSalary());
        //7-->Account.java, Bank.java
        Bank bank = new Bank(10);
        Account account1 = new Account("12345", "Alihan", 1000);
        Account account2 = new Account("67890", "Nigar", 500);
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.deposit(account1, 200);
        bank.withDraw(account2, 100);
        System.out.println("Balance of account 1: " + account1.getBalance());
        System.out.println("Balance of account 2: " + account2.getBalance());
        //8-->TrafficLight.java
        TrafficLight light = new TrafficLight("green", 30);
        System.out.println("Color is green: " + light.isGreen());
        System.out.println("Color is red: " + light.isRed());
        light.changeColor("yellow");
        System.out.println("New color: " + light.getColor());
        System.out.println("Color is green: " + light.isGreen());
        System.out.println("Color is red: " + light.isRed());
        //9-->Employee9.java
        Employee9 emp1 = new Employee9("Miran", 750, 2010);
        System.out.println("Years of service: " + emp1.getYearsOfService());
        //10-->Student.java
        Student student = new Student("Esma", 10, 5);
        student.addCourse("Math");
        student.addCourse("Chemical");
        student.addCourse("Physics");
        student.printCourses();
        student.removeCourse("Math");
        student.printCourses();

    }

    public static int addBook(Book[] books, int bookCount, String title, String author, String ISBN) {
        if (bookCount < books.length) {
            books[bookCount] = new Book(title, author, ISBN);
            bookCount++;
        } else {
            System.out.println("the library is full");
        }
        return bookCount;
    }

    public static int removeBook(Book[] books, int bookCount, String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i] = books[bookCount - 1];
                books[bookCount - 1] = null;
                bookCount--;
                return bookCount;
            }
        }
        System.out.println("Book not found");
        return bookCount;
    }

    public static void displayBooks(Book[] books, int bookCount) {
        if (bookCount == 0) {
            System.out.println("There are no books in the library");
        } else {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }
    }
}