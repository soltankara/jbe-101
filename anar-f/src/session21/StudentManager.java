package session21;

import session21.exception.StudentNotFoundException;
import session21.model.Grade;
import session21.model.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentManager {

    private final List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
        addingStudentsWithFile("C:/Users/anarouis/IdeaProjects/demo-jbe/src/session21/StudentData.txt");
    }

    public void addingStudentsWithFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    Grade grade = Grade.valueOf(parts[1].trim().toUpperCase());
                    students.add(new Student(grade, name));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid grade in the file: " + e.getMessage());
        }
    }

    Optional<Student> findByName(String studentName){
        return students.stream()
                .filter(student -> student.getName()
                        .equalsIgnoreCase(studentName)).findFirst();
    }

    public Student getByName (String studentName){
        return findByName(studentName).orElseThrow(StudentNotFoundException::new);
    }

    public List<Student> findByGrade (Grade grade){
        return students.stream()
                .filter(student -> student.getGrade().equals(grade))
                .toList();
    }

    public void printStudents(){
        students.forEach(System.out::println);
    }

    public void remove(String studentName){
        students.removeIf(student -> student.getName().contains(studentName));
    }

    public Map<Grade, List<Student>> getStudentsByGrade() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
    }
}
