package aysel.src.Session21;

import aysel.src.Session21.Model.Grade;
import aysel.src.Session21.Model.Student;

import static aysel.src.Session21.StudentManager.*;

public class MainFile {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        writeWithWriter();
        manager.getStudents().forEach(student -> System.out.println(student));

        Student student = manager.findByName("Aysel");
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student not found");
        }

        System.out.println(manager.findByGrade(Grade.A));
        manager.removeStudentsByText("n");
        System.out.println(manager.groupStudentsByGrade());


    }
}
