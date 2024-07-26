public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Project Manager", 4000.0);
        Employee employee2 = new Employee("Alice", "UI/UX Designer", 3500.0);

        employee1.printDetails();
        System.out.println();
        employee2.printDetails();
        System.out.println();

        System.out.println("After raised salary : ");
        System.out.println();

        employee1.upgradeSalary(10);
        employee2.upgradeSalary(15);

        employee1.printDetails();
        System.out.println();
        employee2.printDetails();

    }
}
