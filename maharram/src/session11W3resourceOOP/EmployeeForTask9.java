package session11W3resourceOOP;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeForTask9 {
    private String name;
    private double salary;
    private LocalDate hireDate;

    public EmployeeForTask9(String name ,double salary, LocalDate hireDate){
        this.hireDate=hireDate;
        this.salary=salary;
        this.name=name;

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
    public int calculateYearsOfService(){
        return Period.between(hireDate,LocalDate.now()).getYears();
    }
    public void showEmployeeInformation(EmployeeForTask9 employe){
        System.out.println("name :"+name);
        System.out.println("salary :"+salary);
        System.out.println("hire date :"+hireDate);
        System.out.println("years of service :"+employe.calculateYearsOfService());
    }
}
