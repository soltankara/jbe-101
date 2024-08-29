package aysel.src.Session21;
import aysel.src.Session21.Model.Grade;
import aysel.src.Session21.Model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentManager {
    private List<Student>students;

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

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Students.txt"))) {
            writer.write("Nurcan,A");
            writer.newLine();
            writer.write("Sebuhi,A");
            writer.newLine();
            writer.write("Kenan,D");
            writer.newLine();
            writer.write("Aysel,C");
            writer.newLine();
            writer.write("Leyla,B");
            writer.newLine();
            writer.write("Turgut,D");

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
                    String name = parts[0].trim();
                    Grade grade = Grade.valueOf(parts[1].trim());
                    Student student = new Student(name, grade);
                    students.add(student);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public  Student findByName( String name) {
        return students.stream().filter(student -> student.getName().equalsIgnoreCase(name)).findFirst().orElse(null);

    }

    public  List<Student> findByGrade(Grade grade) {
        List<Student> studentsWithGrade = students.stream()
                .filter(student -> student.getGrade() == grade)
                .toList();
        return studentsWithGrade;

    }

    public  List<Student> removeStudentsByText( String text) {
        students.removeIf(student -> student.getName().contains(text));
        return students;

    }

    public Map<Grade, List<Student>> groupStudentsByGrade() {
        Map<Grade, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getGrade));
        return map;
    }
}
