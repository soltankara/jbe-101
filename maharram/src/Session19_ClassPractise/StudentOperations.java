package Session19_ClassPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentOperations {
    public static Student findByName(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public static List<Student> findByGrade(List<Student> students, Grade grade) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() == grade) {
                result.add(student);
            }
        }
        return result;
    }

    public static void removeByNameContains(List<Student> students, String text) {
        students.removeIf(student -> student.getName().contains(text));
    }

    public static Map<Grade, List<Student>> groupStudentByGrade(List<Student> students) {
        Map<Grade, List<Student>> gradeMap = new HashMap<>();
        for (Student student : students) {
            gradeMap.computeIfAbsent(student.getGrade(), k -> new ArrayList<>()).add(student);
        }
        return gradeMap;
    }

    //-------------------------------------------------------------------------------------------------
    public static Student findByNameWithStream(List<Student> students, String name) {
        return students.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public static List<Student> findByGradeWithStream(List<Student> students, Grade grade) {
        return students.stream()
                .filter(student -> student.getGrade() == grade)
                .collect(Collectors.toList());
    }

    public static void removeByNameContainsWithStream(List<Student> students, String text) {
        students.removeIf(student -> student.getName().contains(text));
    }

    public static Map<Grade, List<Student>> groupStudentByGradeWithStream(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(Student::getGrade));
    }
}
