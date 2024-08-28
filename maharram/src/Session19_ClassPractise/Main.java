package Session19_ClassPractise;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.students.add(new Student("Saleh", Grade.E));
        student.students.add(new Student("Araz", Grade.C));
        student.students.add(new Student("Sabuhi", Grade.B));
        student.students.add(new Student("Javad", Grade.D));
        student.students.add(new Student("Kanan", Grade.B));
        student.students.add(new Student("Maharram", Grade.E));

        System.out.println("find student by name (Maharram) :" + StudentOperations.findByName(student.students, "Maharram"));
        System.out.println("find student by grade (B) :" + StudentOperations.findByGrade(student.students, Grade.B));
        Map<Grade, List<Student>> gradeMap = StudentOperations.groupStudentByGrade(student.students);
        System.out.println("group students by grade " + gradeMap);
        StudentOperations.removeByNameContains(student.students, "a");
        System.out.println("remove student by text contains(a) :" + student.students);
        System.out.println("--------------------------------------------------------------------------------------");

        student.students.add(new Student("Muhammed", Grade.E));
        student.students.add(new Student("Ali", Grade.C));
        student.students.add(new Student("Turqut", Grade.B));
        student.students.add(new Student("Omar", Grade.D));
        student.students.add(new Student("Bahruz", Grade.B));
        student.students.add(new Student("Maharram", Grade.E));

        System.out.println("find student by name (Maharram) :" + StudentOperations.findByNameWithStream(student.students, "Maharram"));
        System.out.println("find student by grade (B) :" + StudentOperations.findByGradeWithStream(student.students, Grade.B));
        Map<Grade, List<Student>> gradeMap1 = StudentOperations.groupStudentByGradeWithStream(student.students);
        System.out.println("group students by grade " + gradeMap1);
        StudentOperations.removeByNameContainsWithStream(student.students, "a");
        System.out.println("remove student by text contains(a) :" + student.students);
    }
}