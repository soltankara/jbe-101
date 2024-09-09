package Session21_File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentService {
    private List<Student> students;
    private final String fileName = "TuringStudents.obj";

    public StudentService() {
        this.students = new ArrayList<>();
        readFromFile();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudentByGrade(Grade grade) {
        return students.stream()
                .filter(student -> student.getGrade() == grade).collect(Collectors.toList());
    }

    public void removeStudentsByNameContains(String text) {
        students.removeIf(student -> student.getName().contains(text));
    }

    public Map<Grade, List<Student>> getGradeMap() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (List<Student>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateFile() {
        saveToFile();
    }

    public void printStudents() {
        students.forEach(System.out::println);
    }
}
