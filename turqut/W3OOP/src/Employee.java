public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
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

    void upgradeSalary(int percentage) {
        salary = salary + (percentage * salary / 100);
    }

    void printDetails() {
        System.out.println("Name : " + name);
        System.out.println("Job title : " + jobTitle);
        System.out.println("Salary : " + salary);
    }
}
