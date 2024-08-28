package az.turing.session19;

import java.util.*;

public class Main {

    static List<Student> list = new ArrayList<>();

    public static void main(String[] args) {


        Student s1 = new Student("Turgut", Grade.A);
        Student s2 = new Student("Sənan", Grade.B);
        Student s3 = new Student("Səbuhi", Grade.C);
        Student s4 = new Student("Leyla", Grade.B);
        Student s5 = new Student("Ferman", Grade.D);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //Task2
        System.out.println(findByName("Ayxan"));
        System.out.println("Senan");

        //Task3
        System.out.println(gradeStudent(Grade.B));

        //Task4
        System.out.println("After removed some elements : ");
        removeElement("Sə");

        //Task5
        Map<Grade, List<Student>> map = new HashMap<>();
        for (Student s : list) {
            map.getOrDefault(s.getGrade(), new ArrayList<>());
        }

        System.out.println(map);


    }

    public static Optional<Student> findByName(String name) {
        for (Student s : list) {
            if (s.getName().equals(name)) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    public static List<Student> gradeStudent(Grade grade) {

        List<Student> result = new ArrayList<>();
        for (Student student : list) {
            if (student.getGrade() == grade) {
                result.add(student);
            }
        }
        return result;
    }

    public static void removeElement(String text) {
        list.removeIf(student -> student.getName().contains(text));
        System.out.println(list);
    }
}
