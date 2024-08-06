package OOPquestions.problem10;

public class MainPart {
    public static void main(String[] args) {
        Student student1 = new Student("Nihad", 10);
        Student student2 = new Student("Kamil", 11);
        Student student3 = new Student("Ilqar", 9);

        student1.addCourse("Chemistry");
        student1.addCourse("Biology");
        student1.addCourse("Physics");
        System.out.println(student1.getCourses());

        student1.removeCourse("Biology");
        System.out.println(student1.getCourses());
    }
}
