package session11W3resourceOOP;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.jobTitle = jobTitle;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * percentage / 100;
        }
    }

    public void decreaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary -= this.salary * percentage / 100;
        }
    }
    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", jobTitle='" + jobTitle + '\'' + ", salary=" + salary + '}';
    }

}
