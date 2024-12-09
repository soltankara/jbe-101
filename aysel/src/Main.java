
import Session11.*;
import Session11.Book;
import Session11.Dog;

public class Main {
    public static void main(String[] args) {
      // Book b1= new Book("name","author1");
       // Book b2=new Book("name1","author1");
      //  Book b3=b2;

      //  System.out.println(b2.equals(b1));
     //   System.out.println(b3==b2);
    //    System.out.println(b3.equals(b2));
    //    System.out.println(b3==b1);
    //    System.out.println(b3.equals(b1));



     //  Duck duck =new Duck();
       // duck.setName("Duffy");
       // duck.swim();
      //  duck.fly();


        // Ev tapsiriqlari burdan baslayir


        Person person1=new Person("Aysel",21);
        Person person2=new Person("Resad",25);
        System.out.println("Person 1: " + person1.getName() + ", Yaş: " + person1.getAge());
        System.out.println("Person 2: " + person2.getName() + ", Yaş: " + person2.getAge());


       Dog dog1= new Dog("Rex","Dalmatin");
        dog1.setName("Toplan");
        dog1.setBreed("Labrador");
        System.out.println("The name of dog is " + dog1.getName());
        System.out.println("The breed of dog is " + dog1.getBreed());


        Rectangle rectangle1=new Rectangle(2.4,3);
        System.out.println("Area of rectangle is "+rectangle1.getArea());
        System.out.println("Perimeter of rectangle is " + rectangle1.getPerimeter());


        Circle circle1= new Circle(2);
        circle1.setRadius(2.5);
        System.out.println("Area of circle is "+circle1.getArea());
        System.out.println("Circumference of circle is "+ circle1.getCircumference());


       BookCollection collection1=new BookCollection(20);
        collection1.addBook("Book 1", "  Author 1", 12345);
        collection1.addBook("Book 2", "Author 2", 67890);
        collection1.removeBook(12345);
        collection1.removeBook(11111);



       Employee employee1=new Employee("John","Engineer",2000);
        employee1.updateSalary(3000);
        System.out.println("Salary updated");
        employee1.showInfo();
        employee1.increasedSalary(50);
        System.out.println("\nAfter giving 50 % increase" );
        employee1.showInfo();


        TrafficLight trafficLight = new TrafficLight("Red", 30);
        trafficLight.setColor("Green");
        trafficLight.setDuration(60);
        System.out.println("\nAfter changing the color and duration:");
        trafficLight.displayTrafficLightState();
        System.out.println("Is red? " + trafficLight.isRed());
        System.out.println("Is green? " + trafficLight.isGreen());





  }}
