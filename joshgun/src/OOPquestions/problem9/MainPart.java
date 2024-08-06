package OOPquestions.problem9;
/*Write a Java program to create a class called "Employee" with a name,
salary, and hire date attributes, and a method to calculate years of service.*/

import java.time.LocalDate;

public class MainPart {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Anar", LocalDate.parse("2012-01-22"), 1500);
        Employee employee2 = new Employee("Aydin", LocalDate.parse("2018-01-22"), 1500);

        employee1.getInformation();
        System.out.println("Year of the service is " + employee1.getYears());
        System.out.println();
        employee2.getInformation();
        System.out.println("Year of the service is " + employee2.getYears());
    }
}
