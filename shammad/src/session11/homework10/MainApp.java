package session11.homework10;

/*
10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes,
    and methods to add and remove courses.
*/
public class MainApp {
    public static void main(String[] args) {
        Student student1 = new Student("Semmed", 11);
        Student student2 = new Student("Sabuhi", 2);

        student1.addCourse("Chemistry");
        student1.addCourse("Mathematics");

        student2.addCourse("Biology");
        student2.addCourse("Gym");

        student1.displayStudentInformation();
        student2.displayStudentInformation();

        System.out.println("Removing Gym from %s student".formatted(student2.getName()));
        student2.removeCourse("Gym");

        System.out.println("After removing Gym");
        student2.displayStudentInformation();
    }
}
