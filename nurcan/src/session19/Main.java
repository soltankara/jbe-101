package session19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student("Nurcan", Grade.A);
        Student student1 = new Student("Nesrin", Grade.B);
        Student student2 = new Student("Zehra", Grade.D);
        students.add(student);
        students.add(student1);
        students.add(student2);
        String name = "Nurcan";
        System.out.println(findByName(name, students));
        Grade a = Grade.B;
        System.out.println(findByGrade(a, students));
        String text = "es";
        removeStudent(text, students);
        System.out.println("New list: " + students);
        System.out.println(createMap(students));

    }

    public static Optional<Student> findByName(String name, List<Student> students) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public static List<Student> findByGrade(Grade a, List<Student> students) {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade().equals(a)) {
                list.add(student);
            }
        }
        return list;
    }

    public static void removeStudent(String text, List<Student> students) {
        students.removeIf(student -> student.getName().contains(text));
    }

    public static Map<Grade, List<Student>> createMap(List<Student> students) {
        Map<Grade, List<Student>> map = new HashMap<>();
        for (Student student : students) {
            map.putIfAbsent(student.getGrade(), new ArrayList<>());
            map.get(student.getGrade()).add(student);
        }
        return map;
    }
}
