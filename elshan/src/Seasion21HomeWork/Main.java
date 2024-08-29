package Seasion21HomeWork;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void writeStudentsToFile(List<Student> students, String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (Student student : students) {
                writer.println(student.getName() + ", " + student.getGrade());
            }
        }
    }

    public static List<Student> readStudentsFromFile(String fileName) throws IOException {

        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line;
            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(", ");
                String name = parts[0];

                Grade grade = Grade.valueOf(parts[1]);
                students.add(new Student(name, grade));
            }
        }
        return students;
    }

    public static Student getStudentByName(List<Student> students, String name) {
        return students.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public static List<Student> getStudentsByGrade(List<Student> students, Grade grade) {
        return students.stream()
                .filter(student -> student.getGrade() == grade)
                .collect(Collectors.toList());
    }

    public static void removeStudentsByNameContains(List<Student> students, String text) {
        students.removeIf(student -> student.getName().toLowerCase().contains(text.toLowerCase()));
    }

    public static Map<Grade, List<Student>> groupStudentsByGrade(List<Student> students) {
        return students.stream().collect(Collectors.groupingBy(Student::getGrade));
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Elshan", Grade.A));
        students.add(new Student("Nigar", Grade.B));
        students.add(new Student("Vusal", Grade.C));
        students.add(new Student("Elchin", Grade.B));
        students.add(new Student("Orxan", Grade.A));

        String fileName = "students.txt";

        try {

            writeStudentsToFile(students, fileName);

            List<Student> loadedStudents = readStudentsFromFile(fileName);

            // 2.Create a method returns a single student by given name

            Student student = getStudentByName(loadedStudents, "Ali");
            System.out.println("Student found: " + student);

            // 3. Create a method returns list of students by given grade

            List<Student> gradeBStudents = getStudentsByGrade(loadedStudents, Grade.B);
            System.out.println("Students with grade B: " + gradeBStudents);

            // 4. Create a method removes students from list if student name contains given text

            removeStudentsByNameContains(loadedStudents, "an");
            System.out.println("Students after removal: " + loadedStudents);

            // 5. Create a map from the list
            Map<Grade, List<Student>> groupedByGrade = groupStudentsByGrade(loadedStudents);
            System.out.println("Students grouped by grade: " + groupedByGrade);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}