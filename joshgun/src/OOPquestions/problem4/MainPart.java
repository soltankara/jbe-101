package OOPquestions.problem4;
/*Write a Java program to create a class called "Circle" with a radius attribute.
You can access and modify this attribute. Calculate the area and circumference of the circle.*/

import java.util.Scanner;

public class MainPart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("\nThe area is " + circle.getArea()); // radius = 5, area = 157.07
        System.out.println("The circumference is " + circle.getcircumference()); // radius = 5, circumference = 31.4
    }
}
