package collections.dataStructure2ClassExercise;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class MainWithFileIO {
    public static final String fileName = "student.txt";
    public static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        loadStudents();
        students.add(new Student("Behruz", Grade.A));
        students.add(new Student("Adil", Grade.B));
        students.add(new Student("Sebuhi", Grade.C));
        students.add(new Student("Cavad", Grade.D));
        students.add(new Student("Semmed", Grade.A));
        students.add(new Student("Anar", Grade.B));
        students.add(new Student("Elsen", Grade.C));
        students.add(new Student("Aysel", Grade.D));
        students.add(new Student("Turqut", Grade.A));
        students.add(new Student("Royal", Grade.E));
        saveStudents();

        // Task 2
        System.out.println("Student by name 'Turqut': " + getStudentByName("Turqut"));
        // Task 3
        System.out.println("Students with grade 'A': " + getStudentsByGrade(Grade.A));
        // Task 5
        System.out.println("Student map by grade: " + createStudentMap());
        // Task 4
        System.out.println("Students list: " + students);
        removeStudentsByNameContains("a");
        System.out.println("Students after removing those with names containing 'a': " + students);

        saveStudents();
    }

    public static Optional<Student> getStudentByName(String name) {
        return students.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst();
    }

    public static List<Student> getStudentsByGrade(Grade grade) {
        return students.stream()
                .filter(student -> student.getGrade() == grade)
                .collect(Collectors.toList());
    }

    public static void removeStudentsByNameContains(String text) {
        students.removeIf(student -> student.getName().toLowerCase().contains(text.toLowerCase()));
    }

    public static Map<Grade, List<Student>> createStudentMap() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
    }

    private static void saveStudents() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Student student : students) {
                writer.write(student.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void loadStudents() {
        File file = new File(fileName);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    students.add(Student.fromFileString(line));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
