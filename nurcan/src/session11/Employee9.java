package session11;

public class Employee9 {
    private String name;
    private double salary;
    private int hireYear;

    public Employee9(String name, double salary, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public int getYearsOfService() {
        int currentDate = 2024;
        return currentDate - getHireYear();
    }
}
