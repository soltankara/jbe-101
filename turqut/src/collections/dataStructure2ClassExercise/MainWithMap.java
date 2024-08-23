package collections.dataStructure2ClassExercise;

import java.util.*;

public class MainWithMap {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Student s1 = new Student("Behruz", Grade.A);
        Student s2 = new Student("Adil", Grade.B);
        Student s3 = new Student("Sebuhi", Grade.C);
        Student s4 = new Student("Cavad", Grade.D);
        Student s5 = new Student("Semmed", Grade.A);
        Student s6 = new Student("Anar", Grade.B);
        Student s7 = new Student("Elsen", Grade.C);
        Student s8 = new Student("Aysel", Grade.D);
        Student s9 = new Student("Turqut", Grade.A);
        Student s10 = new Student("Royal", Grade.E);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);

        //Task2
        System.out.println("Student by name 'Turqut': " + getStudentByName("Turqut"));
        //Task3
        System.out.println("Students with grade 'A': " + getStudentsByGrade(Grade.A));

        //Task5
        System.out.println("Student map by grade: " + createStudentMap());

        //Task4
        System.out.println("Students list : " + students);
        removeStudentsByNameContains("a");
        System.out.println("Students after removing those with names containing 'a': " + students);


    }

    public static Optional<Student> getStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public static List<Student> getStudentsByGrade(Grade grade) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() == grade) {
                result.add(student);
            }
        }
        return result;
    }

    public static void removeStudentsByNameContains(String text) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().toLowerCase().contains(text.toLowerCase())) {
                iterator.remove();
            }
        }
    }

    public static Map<Grade, List<Student>> createStudentMap() {
        Map<Grade, List<Student>> map = new HashMap<>();
        for (Student student : students) {
            Grade grade = student.getGrade();
            map.computeIfAbsent(grade, k -> new ArrayList<>()).add(student);
        }
        return map;
    }
}
