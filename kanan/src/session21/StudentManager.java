package session21;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

enum Grade {
    A, B, C, D, E
}
class Student implements Serializable {
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
        return "Student{name='" + name + "', grade=" + grade + '}';
    }
}
public class StudentManager {
    private List<Student> students;
    private final String filePath = "students.dat";
    public StudentManager() {
        this.students = new ArrayList<>();
        loadFromFile();
    }
    public void addStudent(Student student) {
        students.add(student);
        saveToFile();
    }
    public Student getStudentByName(String name) {
        return students.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }
    public List<Student> getStudentsByGrade(Grade grade) {
        return students.stream()
                .filter(student -> student.getGrade() == grade)
                .collect(Collectors.toList());
    }
    public void removeStudentsByNameContaining(String text) {
        students.removeIf(student -> student.getName().toLowerCase().contains(text.toLowerCase()));
        saveToFile();
    }
    public Map<Grade, List<Student>> groupStudentsByGrade() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
    }
    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            students = (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            students = new ArrayList<>();
        }
    }
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student("Kanan", Grade.A));
        manager.addStudent(new Student("Cavad", Grade.B));
        manager.addStudent(new Student("Soltan", Grade.C));
        manager.addStudent(new Student("Omer", Grade.A));
        manager.addStudent(new Student("Saleh", Grade.B));
        System.out.println("Student with name 'Kanan': " + manager.getStudentByName("Kanan"));

        System.out.println("Students with grade B: " + manager.getStudentsByGrade(Grade.B));

        manager.removeStudentsByNameContaining("nan");
        System.out.println("Students after removing names containing 'nan': " + manager.students);

        Map<Grade, List<Student>> groupedByGrade = manager.groupStudentsByGrade();
        System.out.println("Students grouped by grade: " + groupedByGrade);
    }
}
