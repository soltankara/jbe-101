package Session19_ClassPractise;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentWithStream {
    private String name;
    private Grade grade;

    public StudentWithStream(String name, Grade grade) {
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
        return students.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public static List<Student> findByGrade(List<Student> students, Grade grade) {
        return students.stream()
                .filter(student -> student.getGrade() == grade)
                .collect(Collectors.toList());
    }

    public static void removeByNameContains(List<Student> students, String text) {
        students.removeIf(student -> student.getName().contains(text));
    }

    public static Map<Grade, List<Student>> groupStudentByGrade(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(Student::getGrade));
    }
}
