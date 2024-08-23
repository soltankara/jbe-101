package ClassworkMaps;

import java.util.*;

import static ClassworkMaps.Grades.A;
import static ClassworkMaps.Grades.B;

public class Classwork {
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Student Omar = new Student("Omar", A);
        Student Lala = new Student("Lala", A);
        Student Aynur = new Student("Aynur", B);
        students.add(Omar);
        students.add(Lala);
        students.add(Aynur);
        System.out.println(getStudents(students));
    }

    static Optional<Student> getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public static void liststudentbygrade(Grades grade) {
        ArrayList<Student> students2 = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrades().equals(grade)) {
                students2.add(student);
            }
        }
        if (students2.isEmpty()) {
            System.out.println("Student not found");
        } else {
            for (Student student : students2) {
                System.out.println(student);
            }
        }

    }

    public static void removeStudent(String word) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().contains(word)) {
                students.remove(i);
            } else {
                System.out.println(students.get(i));
            }
        }

    }

    public static Map<Grades, List<Student>> getStudents(List<Student> students) {
        Map<Grades, List<Student>> map = new HashMap<>();
        for (Student student : students) {
            map.put(student.getGrades(), students);
        }
        return map;
    }


}
