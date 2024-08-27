package Session19_ClassPractise;
import java.util.ArrayList;
import java.util.List;
public class Student {
    List<Student> students = new ArrayList<>();
    private String name;
    private Grade grade;

    public Student() {
    }

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
}
