package OOPquestions.problem9;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private int salary;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate, int salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getYears(){
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public void getInformation(){
        System.out.println(name + " | " + hireDate + " | " + salary);
    }
}
