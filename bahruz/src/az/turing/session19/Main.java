package az.turing.session19;

import az.turing.session21.file.FileUtility;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static List<Student> list = new ArrayList<>();

    public static void main(String[] args) {


        //task1
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
//
//        //Task2
//        System.out.println(findByName("Turgut"));
//
//        //Task3
//        System.out.println(gradeStudent(Grade.B));
//
//        //Task4
//        System.out.println("After removed some elements : ");
//        removeElement("Sə");
//
//        //Task5
//        Map<Grade, List<Student>> map = new HashMap<>();
//        for (Student s : list) {
//            map.getOrDefault(s.getGrade(), new ArrayList<>());
//        }


        //LastHomeWork

        //fayla yazmaq
        try {
            FileUtility.writeObjectToFile(s1, "s1.obj");
            FileUtility.writeObjectToFile(s2, "s2.obj");
            FileUtility.writeObjectToFile(s3, "s3.obj");
            FileUtility.writeObjectToFile(s4, "s4.obj");
            FileUtility.writeObjectToFile(s5, "s5.obj");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //fayldan oxumaq
        try {
            System.out.println(FileReadAndWrite.readObjectFromFile("s1.obj"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static Optional<Student> findByName(String name) {
        return list.stream().filter(student -> student.getName().equals(name)).findFirst();
    }

    public static List<Student> gradeStudent(Grade grade) {
        return list.stream().filter(student -> student.getGrade().equals(grade)).collect(Collectors.toList());

    }

    public static void removeElement(String text) {
        list.removeIf(student -> student.getName().contains(text));
        System.out.println(list);
    }
}
