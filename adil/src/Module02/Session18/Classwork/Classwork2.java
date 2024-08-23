package Module02.Session18.Classwork;

import java.util.*;

public class Classwork2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student st1 = new Student("Adil", Grade.A);
        Student st2 = new Student("Anar", Grade.A);
        Student st3 = new Student("Joshgun", Grade.A);
        students.add(st1);
        students.add(st2);
        students.add(st3);
//        deleteBySubstring(students, "A");
//        System.out.println(findByGrade(students, Grade.A));

        Map<Grade, List<Student>> map = new HashMap<>();
        for (Student student : students) {
            List<Student> gradeList = map.getOrDefault(student.getGrade(), new ArrayList<>());
            gradeList.add(student);
            map.put(student.getGrade(), gradeList);
        }

        System.out.println(map.get(Grade.A));
    }

    private static Optional<Student> findByName(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    private static List<Student> findByGrade(List<Student> students, Grade grade) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade().equals(grade)) {
                result.add(student);
            }
        }
        return result;
    }

    private static void deleteBySubstring(List<Student> students, String substring) {
        students.removeIf(student -> student.getName().contains(substring));
    }
}
