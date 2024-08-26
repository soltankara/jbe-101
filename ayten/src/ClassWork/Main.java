package ClassWork;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
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

    }

    static Optional<Student> findByName(String name, List<Student> students) {
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
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

    static void removeByName(String name, List<Student> students) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) students.remove(student);
        }
    }

}
