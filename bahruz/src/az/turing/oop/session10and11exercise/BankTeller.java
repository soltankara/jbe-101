package az.turing.oop.session10and11exercise;

public class BankTeller {

    //Exercise 6
    private String name;
    private String jobTitle;
    private double salary;

    public BankTeller(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void salaryOfIncreasedTeller(double percentage) {
        salary = salary + salary * percentage / 100;
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

    @Override
    public String toString() {
        return "BankTeller {" + "name: " + name + " ,jobTitle: " + jobTitle + " ,salary: " + salary + '}';
    }
}
