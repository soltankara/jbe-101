import java.time.LocalDate;

public class Employee2Main {
    public static void main(String[] args) {
        Employee2 employee1 = new Employee2("John Doe", 20000.0, LocalDate.parse("2000-01-01"));
        Employee2 employee2 = new Employee2("Jane Smith", 35000.0, LocalDate.parse("1999-05-31"));

        employee1.printDetails();
        System.out.println("Years of service: " + employee1.yearsOfService());
        employee2.printDetails();
        System.out.println("Years of service: " + employee2.yearsOfService());
    }
}
