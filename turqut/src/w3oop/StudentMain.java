package turqut.src.w3oop;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 10);
        Student student2 = new Student("Jane Smith", 9);

        System.out.println("Student details : ");
        student1.displayStudentDeatils();
        student2.displayStudentDeatils();

        System.out.println("Adding course for student " + student1.getName());
        student1.addCourse("Math");
        student1.addCourse("Science");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
        System.out.println("Adding course for student " + student2.getName());
        student2.addCourse("English");
        student2.addCourse("History");
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());
        System.out.println("Removing course for student " + student1.getName());
        student1.removeCourse("Math");
        System.out.println(student1.getName() + "'s courses: " + student1.getCourses());
        System.out.println("Removing course for student " + student2.getName());
        student2.removeCourse("History");
        System.out.println(student2.getName() + "'s courses: " + student2.getCourses());


    }
}
