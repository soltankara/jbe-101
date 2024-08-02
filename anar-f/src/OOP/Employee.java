package OOP;

public class Employee {
    private String name;
    private int salary;
    private String title;
    public Employee() {}
    public Employee(String name, int salary, String title) {
        this.name = name;
        this.salary = salary;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public double calculateSalary() {
        return this.salary;
    }
    public double updateSalary(double percentage) {
        if (percentage > 0) {
            this.salary += (int) (this.salary * (percentage / 100));
        } else {
            System.out.println("invalid percentage");
        }
        return this.salary;
    }
}
