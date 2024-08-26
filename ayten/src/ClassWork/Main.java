package ClassWork;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Student Leyla = new Student("Leyla", Grade.A);
        Student Nurcan = new Student("Nurcan", Grade.B);
        students.add(Leyla);
        students.add(Nurcan);
        Map<Grade, List<Student>> studentMap = new HashMap<>();
        for (Student student : students) {
//            List<Student> mapList=studentMap.get(student.getGrade());
//            mapList=new ArrayList<>();
//            studentMap.put(student.getGrade(),mapList);
            List<Student> list = studentMap.getOrDefault(student.getGrade(), new ArrayList<>());
            list.add(student);
            studentMap.put(student.getGrade(), list);
            Map<Grade, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getGrade));

        }
        removeByName("Leyla", students);
        System.out.println("after removing");
        students.forEach(student -> System.out.println(student.getGrade() + " " + student.getName()));

    }

    static Optional<Student> findByName(String name, List<Student> students) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) return Optional.of(student);
        }
        return Optional.empty();
    }

    static List<Student> findingByGrade(Grade grade, List<Student> students) {
        List<Student> update = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() == grade) update.add(student);
        }
        return update;
    }

    public static void removeByName(String name, List<Student> students) {
        students.removeIf(student -> student.getName().equalsIgnoreCase(name));
    }

}
