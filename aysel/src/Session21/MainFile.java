package aysel.src.Session21;

import aysel.src.Session21.Model.Grade;
import aysel.src.Session21.Model.Student;

import java.util.List;

import static aysel.src.Session21.StudentManager.*;

public class MainFile {
    public static void main(String[] args) {
        writeWithWriter();
        List<Student> students = readWithReader("Students.txt");
        students.stream().forEach(student -> System.out.println(student));

        Student student = findByName(students, "Aysel");
        if (student != null) {
            System.out.println("Student found: " + student);
        } else {
            System.out.println("Student not found");
        }

        System.out.println(findByGrade(Grade.A, students));
        System.out.println(removeStudentsByText(students, "n"));
        System.out.println(groupStudentsByGrade(students));


    }
}
