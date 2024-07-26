import java.time.LocalDate;

public class Employee2 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public Employee2(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int yearsOfService() {
        LocalDate today = LocalDate.now();
        return today.getYear() - hireDate.getYear();
    }

    public void printDetails() {
        System.out.println("\nName : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Hire Date : " + hireDate);
    }
}
