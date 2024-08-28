package session21;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileManager {
    public static void main(String[] args) {
        System.out.println(readStudents("C:\\Users\\ACER\\IdeaProjects\\jbe-101\\jbe-101\\nurcan\\src\\session21\\students.txt"));
        findByName("Nurcan", "C:\\Users\\ACER\\IdeaProjects\\jbe-101\\jbe-101\\nurcan\\src\\session21\\students.txt");
        findByGrade("A", "C:\\Users\\ACER\\IdeaProjects\\jbe-101\\jbe-101\\nurcan\\src\\session21\\students.txt");
        removeStudent("giz", "C:\\Users\\ACER\\IdeaProjects\\jbe-101\\jbe-101\\nurcan\\src\\session21\\students.txt");
        System.out.println(createMap("C:\\Users\\ACER\\IdeaProjects\\jbe-101\\jbe-101\\nurcan\\src\\session21\\students.txt"));
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

    public static void findByName(String name, String fileName) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line;
            boolean flag = false;
            while ((line = br.readLine()) != null) {
                String[] student = line.split(",");
                if (student[0].equalsIgnoreCase(name)) {
                    System.out.println("Name: " + student[0] + ", grade: " + student[1]);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Not found");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void findByGrade(String grade, String fileName) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line;
            boolean flag = false;
            while ((line = br.readLine()) != null) {
                String[] student = line.split(",");
                if (student[1].equalsIgnoreCase(grade)) {
                    System.out.println("Name: " + student[0] + ", grade: " + student[1]);
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Not found");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static void removeStudent(String text, String fileName) {
        List<String> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] student = line.split(",");
                if (!student[0].contains(text)) {
                    students.add(line);
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)))) {
            for (String student : students) {
                bw.write(student);
                bw.newLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        System.out.println("After deletion: " + students);
    }

    public static Map<String, Student> createMap(String fileName) {
        Map<String, Student> map = new HashMap<>();
        List<String> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] student = line.split(",");
                if (student.length == 2) {
                    String name = student[0];
                    String grade = student[1];
                    map.put(grade, new Student(name, grade));
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return map;
    }
}
