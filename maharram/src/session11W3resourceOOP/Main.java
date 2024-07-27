package session11W3resourceOOP;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //1. Write a Java program to create a class called "Person" with a name and age attribute.
        // Create two instances of the "Person" class, set their attributes using the constructor,
        // and print their name and age.
        Person person1 = new Person("David", 19);
        Person person2 = new Person("Murad ", 55);
        System.out.println(person1.name + " is " + person2.age + " years old");
        System.out.println(person2.name + " is " + person2.age + " years old");
        //----------------------------------------------------------------------------------------
        // 2.Write a Java program to create a class called "Dog" with a name and breed attribute.
        // Create two instances of the "Dog" class, set their attributes using the constructor
        // and modify the attributes using the setter methods and print the updated values.
        Dog dog = new Dog("Bobby", "Kangal");
        System.out.println("name : " + dog.getName() + ",  breed : " + dog.getBreed());
        dog.setName("Bozik");
        dog.setBreed("Alabay");
        System.out.println("name : " + dog.getName() + ",  breed : " + dog.getBreed());
        //-------------------------------------------------------------------------------------------
        //3. Write a Java program to create a class called "Rectangle" with width and height attributes.
        // Calculate the area and perimeter of the rectangle.
        Rectangle rectangle = new Rectangle(12, 10);
        System.out.println("the area of rectangle : " + rectangle.calculateArea());
        System.out.println("the perimeter of rectangle : " + rectangle.calculatePerimeter());
        rectangle.setHeight(3.3);
        rectangle.setWidth(4.4);
        System.out.println("the area of rectangle : " + rectangle.calculateArea());
        System.out.println("the perimeter of rectangle : " + rectangle.calculatePerimeter());
        //--------------------------------------------------------------------------------------------
        //4. Write a Java program to create a class called "Circle" with a radius attribute.
        // You can access and modify this attribute. Calculate the area and circumference of the circle.
        Circle circle = new Circle(3);
        circle.printInfoAboutCircle();
        circle.setRadius(5.5);
        circle.printInfoAboutCircle();
        //----------------------------------------------------------------------------------------------
        //5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN,
        // and methods to add and remove books from a collection.
        Book book1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "90804567894858");
        Book book2 = new Book("What is Life ", "Micheakl", "90804566574858");
        Book book3 = new Book("world", "Stib", "9080456789345");
        Book.showBooks();
        Book.addBook(book1);
        Book.addBook(book2);
        Book.addBook(book3);
        Book.showBooks();
        Book.removeBook(book3);
        Book.showBooks();
        Book.removeBook(new Book("s", "d", "123"));//book not found
        Book.showBooks();
        //-------------------------------------------------------------------------------------------------
        //6. Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
        // and methods to calculate and update salary.
        Employee emp1 = new Employee("Davud", "driver", 40000);
        Employee emp2 = new Employee("David", "programmer", 100000);
        System.out.println(emp2);
        System.out.println(emp1);
        emp1.increaseSalary(10);
        emp2.decreaseSalary(10);
        System.out.println(emp1);
        System.out.println(emp2);
        //----------------------------------------------------------------------------------------------------
        //7. Write a Java program to create a class called "Bank" with a collection of accounts and methods to add
        // and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain
        // account details of a particular customer.
        Bank kingBank = new Bank();
        Account acc1 = new Account("Natiq", "1234", 2000);
        Account acc2 = new Account("Nazim", "4321", 10000);
        Account acc3 = new Account("Namiq", "4444", 40000);
        kingBank.addAcount(acc1);
        kingBank.addAcount(acc2);
        kingBank.addAcount(acc3);
        kingBank.showAcounts();
        acc1.deposit(2000);
        acc2.withdrav(6000);
        acc3.withdrav(36000);
        kingBank.showAcounts();
        //------------------------------------------------------------------------------------------------------
        //8. Write a Java program to create class called "TrafficLight" with attributes for color and duration,
        // and methods to change the color and check for red or green.
        TrafficLight light = new TrafficLight("red", 30);
        System.out.println(light);
        light.setDuration(40);
        light.setColor("green");
        System.out.println(light);
        System.out.println(light.isRead());
        //--------------------------------------------------------------------------------------------------------
        //9. Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes,
        // and a method to calculate years of service.
        EmployeeForTask9 empl1 = new EmployeeForTask9(
                "Robin", 5000, LocalDate.of(2020, 03, 3));
        empl1.showEmployeeInformation(empl1);
        empl1.setName("Baron");
        empl1.setSalary(40000);
        empl1.showEmployeeInformation(empl1);
        //------------------------------------------------------------------------------------------------------------
        //10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes,
        // and methods to add and remove courses.
        Student student = new Student("Ramiz", 8, 7);
        student.showStudentInfo();
        student.addCourse("Math");
        student.addCourse("English");
        student.addCourse("Germany");
        student.addCourse("France");
        student.addCourse("History");
        student.showStudentInfo();
        student.removeCourse("France");
        student.showStudentInfo();
        //-------------------------------------------------------------------------------------------------------
        //11. Write a Java program to create a class called "Library" with a collection of books and
        // methods to add and remove books.
        Library library = new Library(5);
        library.addBook("Roman");
        library.addBook("povest");
        library.addBook("poem");
        library.addBook("literature");
        library.showLibraryInfo();
        library.removeBook("povest");
        library.showLibraryInfo();
        //-------------------------------------------------------------------------------------------------------
        //12. Write a Java program to create a class called "Airplane" with a flight number, destination, and
        // departure time attributes, and methods to check flight status and delay.
        Airplane flight1 = new Airplane("1234", "Baku", LocalTime.of(10, 30));
        Airplane flight2 = new Airplane("4321", "istanbul", LocalTime.of(10, 10));
        flight1.checkStatus();
        flight2.checkStatus();
        flight1.delay(20);
        flight2.delay(30);
        flight1.checkStatus();
        flight2.checkStatus();
        //--------------------------------------------------------------------------------------------------------
        //13. Write a Java program to create a class called "Inventory" with a collection of products
        // and methods to add and remove products, and to check for low inventory.
        Inventory inventory = new Inventory(6, 5);
        inventory.addProduct("table");
        inventory.addProduct("laptop");
        inventory.addProduct("phone");
        inventory.showProducts();
        inventory.removeProduct("table");
        inventory.showProducts();
        //---------------------------------------------------------------------------------------------------------
        //14. Write a Java program to create a class called "School" with attributes for students, teachers,
        // and classes, and methods to add and remove students and teachers, and to create classes.
        School school = new School(3, 15, 3);
        school.addTeacher("professor Bon");
        school.addTeacher("doktor Robert");
        school.addTeacher(" Mr. Jamal ");
        school.addStudent("Nijat");
        school.addStudent("Nihat");
        school.createClass("History 321");
        school.createClass("Paint 123 ");
        school.showStudents();
        school.showClasses();
        school.showTeachers();
        //-----------------------------------------------------------------------------------------------------------
        //15. Write a Java program to create a class called "MusicLibrary" with a collection of songs and
        // methods to add and remove songs, and to play a random song.
        MusicLibrary library1 = new MusicLibrary(6);
        library1.addSong("jazz");
        library1.addSong("pop");
        library1.addSong("classic");
        library1.addSong("retro");
        library1.playRandomSongs();
        library1.showSongs();
        library1.removeSong("jazz");
        library1.showSongs();
        library1.playRandomSongs();
        //-----------------------------------------------------------------------------------------------------------
        //16. Write a Java program to create a class called "Shape" with abstract methods for calculating area
        // and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".
        Shape triangle = new TriangleForTask16(3, 4, 5);
        System.out.println("the area of rectangle :" + triangle.calculateArea());
        System.out.println("the perimeter of rectangle :" + triangle.calculatePerimeter());
        Shape rectangleForTask16 = new RectangleForTask16(5.5, 4.4);
        System.out.println("the perimeter of rectangle :" + rectangleForTask16.calculatePerimeter());
        System.out.println("the area of rectangle : " + rectangleForTask16.calculateArea());
        Shape circleForTask16 = new CircleForTask16(6);
        System.out.println("the area of circle :" + circleForTask16.calculateArea());
        System.out.println("the perimeter of circle :" + circleForTask16.calculatePerimeter());
        //---------------------------------------------------------------------------------------------------------
        //17. Write a Java program to create a class called "Movie" with attributes for title, director, actors,
        // and reviews, and methods for adding and retrieving reviews.
        Movie movie = new Movie("Interstellar", "Cristofer Nolah", 3, 5);
        movie.addActor("Elliot");
        movie.addActor("Carla");
        movie.addReview("this movie is amazing");
        movie.addReview("Fantastik");
        movie.addReview("interesting");
        movie.showMovieDetail();
        //-----------------------------------------------------------------------------------------------------------
        //18. Write a Java program to create a class called "Restaurant" with attributes for menu items, prices,
        // and ratings, and methods to add and remove items, and to calculate average rating.
        Restaurant restaurant = new Restaurant(5,5);
        restaurant.addItem("cola",3);
        restaurant.addItem("Burger",10);
        restaurant.addItem("Pizza",25);
        restaurant.addRating(4.5);
        restaurant.addRating(4.3);
        System.out.println("the average of rating :"+restaurant.calculateAverageRating());
        restaurant.showMenu();
        restaurant.showRatings();
        restaurant.removeItem("cola");
        restaurant.showMenu();
        //--------------------------------------------------------------------------------------------------------




    }
}