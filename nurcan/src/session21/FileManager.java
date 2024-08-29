package session21;

import session19.Grade;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FileManager {
    public static void main(String[] args) {
        List<Student> students = readStudents("C:\\Users\\ACER\\IdeaProjects\\jbe-101\\jbe-101\\nurcan\\src\\session21\\students.txt");
        System.out.println(students);
        System.out.println(findByName("Nurcan", students));
        System.out.println(findByGrade("A", students));
        System.out.println(removeStudent("Nər", students));
        System.out.println(createMap(students));
        System.out.println(updateStudent("Aylin", "B", students));
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

    public static Optional<Student> findByName(String name, List<Student> students) {
        return students.stream().filter(student -> student.getName().equals(name)).findFirst();
    }

    public static List<Student> findByGrade(String grade, List<Student> students) {
        return students.stream().filter(student -> student.getGrade().equals(grade)).collect(Collectors.toList());
    }

    public static List<Student> removeStudent(String text, List<Student> students) {
        students.removeIf(student -> student.getName().contains(text));
        return students;
    }

    public static Map<String, List<Student>> createMap(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(Student::getGrade));
    }

    public static List<Student> updateStudent(String name, String newGrade, List<Student> students) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                student.setGrade(newGrade);
                break;
            }
        }
        return students;
    }
}
