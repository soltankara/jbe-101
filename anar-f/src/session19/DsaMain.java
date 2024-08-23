package session19;

import java.util.*;

public class DsaMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student anar = new Student("Anar", Grades.A);
        Student jan = new Student("Jan", Grades.E);
        Student jay = new Student("Jay", Grades.D);
        students.add(anar);
        students.add(jan);
        students.add(jay);

        System.out.println(findByName("Anar", students).orElseThrow(null));

        remove(students, "J");

        Map<Grades, List<Student>> map = new HashMap<>();


    }

    static Optional<Student> findByName(String name, List<Student> students) {
        for (Student student : students) {
            if (student.getStudentName() == name){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    static List<Student> findByGrade(Grades grade, List<Student> students) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getStudentGrade() == grade){
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    static void remove(List<Student> students, String text) {
        students.removeIf(s -> s.getStudentName().contains(text));
    }

}
