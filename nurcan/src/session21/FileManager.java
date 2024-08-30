package session21;

import session19.Grade;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FileManager {
    public static List<Student> students = readStudents("C:\\Users\\ACER\\IdeaProjects\\jbe-101\\jbe-101\\nurcan\\src\\session21\\students.txt");

    public static void main(String[] args) {
        System.out.println(students);
        System.out.println(findByName("Nurcan"));
        System.out.println(findByGrade("A"));
        System.out.println(removeStudent("Nər"));
        System.out.println(createMap());
        System.out.println(updateStudent("Aylin", "B"));
    }

    public static List<Student> readStudents(String fileName) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] student = line.split(",");
                if (student.length == 2) {
                    String name = student[0];
                    String grade = student[1];
                    students.add(new Student(name, grade));
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return students;
    }

    public static Optional<Student> findByName(String name) {
        return students.stream().filter(student -> student.getName().equals(name)).findFirst();
    }

    public static List<Student> findByGrade(String grade) {
        return students.stream().filter(student -> student.getGrade().equals(grade)).collect(Collectors.toList());
    }

    public static List<Student> removeStudent(String text) {
        students.removeIf(student -> student.getName().contains(text));
        return students;
    }

    public static Map<String, List<Student>> createMap() {
        return students.stream().collect(Collectors.groupingBy(Student::getGrade));
    }

    public static List<Student> updateStudent(String name, String newGrade) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.setGrade(newGrade);
                break;
            }
        }
        return students;
    }
}
