package session21hw;

import static session21hw.StudentManager.writeWithWriter;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        writeWithWriter();
        manager.getStudents().forEach(System.out::println);

        Student student = manager.findByName("Adil");

        System.out.println(manager.findByGrade(Grade.A));
        System.out.println(manager.removeStudentsByText("a"));
        System.out.println(manager.groupStudentsByGrade());
    }
}
