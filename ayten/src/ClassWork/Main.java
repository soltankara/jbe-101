package ClassWork;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Student Leyla = new Student("Leyla", Grade.A);
        Student Nurcan = new Student("Nurcan", Grade.B);
        Student Aysel=new Student("Aysel",Grade.C);
        Student Nurana=new Student("Nurana",Grade.C);
        students.add(Leyla);
        students.add(Nurcan);
        students.add(Nurana);
        students.add(Aysel);
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

        removeByName("Leyla");
        System.out.println("after removing");
        students.forEach(student -> System.out.println(student.getGrade() + " " + student.getName()));
        System.out.println(findByName("Aysel"));
        System.out.println(findingByGrade(Grade.C));
    }

    static Optional<Student> findByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) return Optional.of(student);
        }
        return Optional.empty();
    }

    static List<Student> findingByGrade(Grade grade) {
        List<Student> update = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() == grade) update.add(student);
        }
        return update;
    }

    public static void removeByName(String name) {
        students.removeIf(student -> student.getName().equalsIgnoreCase(name));
    }

}
