package session19;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main1 {
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
        System.out.println(removeStudent(text, students));
        System.out.println("New list: " + students);
        System.out.println(createMap(students));
    }

    public static Optional<Student> findByName(String name, List<Student> students) {
        return students.stream().filter(student -> student.getName().equals(name)).findFirst();
    }

    public static List<Student> findByGrade(Grade a, List<Student> students) {
        return students.stream().filter(student -> student.getGrade().equals(a)).collect(Collectors.toList());
    }

    public static List<Student> removeStudent(String text, List<Student> students) {
        return students.stream().filter(student -> student.getName().contains(text)).collect(Collectors.toList());
    }

    public static Map<Grade, List<Student>> createMap(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(Student::getGrade));
    }
}
