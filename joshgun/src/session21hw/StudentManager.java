package session21hw;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        this.students = readWithReader("Students.txt");
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    static void writeWithWriter() {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Student.txt"))) {
            writer.write("Anar, A");
            writer.newLine();
//            writer.write("Adil, B");
//            writer.newLine();
            writer.write("Johsgun, C");
            writer.newLine();
            writer.write("Kamran, A");
            writer.newLine();
            writer.write("Sadig, B");
            writer.newLine();
            writer.write("Kamil, E");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static List<Student> readWithReader(String fileName) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String data;
            while ((data = reader.readLine()) != null) {
                String[] parts = data.split(",");
                if (parts.length == 2) {
                    String name = parts[0];
                    Grade grade = Grade.valueOf(parts[1]);
                    Student student = new Student(name, grade);
                    students.add(student);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public Student findByName(String name) {
        return students.stream().filter(student -> student.getName().equalsIgnoreCase(name)).findFirst().orElse(null);

    }

    public List<Student> findByGrade(Grade grade) {
        List<Student> studentsWithGrade = students.stream()
                .filter(student -> student.getGrade() == grade)
                .toList();
        return studentsWithGrade;

    }

    public List<Student> removeStudentsByText(String text) {
        students.removeIf(student -> student.getName().contains(text));
        return students;

    }

    public Map<Grade, List<Student>> groupStudentsByGrade() {
        Map<Grade, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getGrade));
        return map;
    }
}