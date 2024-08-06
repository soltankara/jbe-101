package OOPquestions.problem6;
/*Write a Java program to create a class called "Employee" with a name,
job title, and salary attributes, and methods to calculate and update salary.*/
public class MainPart {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Kamran", "Engineer", 2000);
        Employee employee2 = new Employee("Nurlan", "Teacher", 1000);

        System.out.println(employee1.getName() + " " + employee1.getJob() + " " + employee1.getSalary());
        System.out.println(employee2.getName() + " " + employee2.getJob() + " " + employee2.getSalary());

        System.out.println("\nThe information after updating: ");
        System.out.println(employee1.getName() + " " + employee1.getJob() + " " + employee1.getSalaryAfterUpdating(10));
        System.out.println(employee2.getName() + " " + employee2.getJob() + " " + employee2.getSalaryAfterUpdating(10));
    }
}
