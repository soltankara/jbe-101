package Session19_ClassPractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Saleh", Grade.E));
        students.add(new Student("Araz", Grade.C));
        students.add(new Student("Sabuhi", Grade.B));
        students.add(new Student("Javad", Grade.D));
        students.add(new Student("Kanan", Grade.B));
        students.add(new Student("Maharram", Grade.E));

        System.out.println("find student by name (Maharram) :" + Student.findByName(students, "Maharram"));
        System.out.println("find student by grade (B) :" + Student.findByGrade(students, Grade.B));
        Map<Grade, List<Student>> gradeMap = Student.groupStudentByGrade(students);
        System.out.println("group students by grade " + gradeMap);
        Student.removeByNameContains(students, "a");
        System.out.println("remove student by text contains(a) :" + students);
        System.out.println("--------------------------------------------------------------------------------------");

        List<Student> studentsForStream = new ArrayList<>();
        studentsForStream.add(new Student("Muhammed", Grade.E));
        studentsForStream.add(new Student("Ali", Grade.C));
        studentsForStream.add(new Student("Turqut", Grade.B));
        studentsForStream.add(new Student("Omar", Grade.D));
        studentsForStream.add(new Student("Bahruz", Grade.B));
        studentsForStream.add(new Student("Maharram", Grade.E));

        System.out.println("find student by name (Maharram) :" + StudentWithStream.findByName(studentsForStream, "Maharram"));
        System.out.println("find student by grade (B) :" + StudentWithStream.findByGrade(studentsForStream, Grade.B));
        Map<Grade, List<Student>> gradeMap1 = StudentWithStream.groupStudentByGrade(studentsForStream);
        System.out.println("group students by grade " + gradeMap1);
        StudentWithStream.removeByNameContains(studentsForStream, "a");
        System.out.println("remove student by text contains(a) :" + studentsForStream);
    }
}