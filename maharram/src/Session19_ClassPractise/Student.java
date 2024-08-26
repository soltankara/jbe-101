package Session19_ClassPractise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private Grade grade;

    public Student(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

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
}
