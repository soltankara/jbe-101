package OOP;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(2425);
        System.out.println(employee.calculateSalary());
        double salaryShow = employee.updateSalary(65.32);
        System.out.println(salaryShow);
    }
}
