package aysel.src.Session19;

import java.util.*;

public class ClassWork {
    public static void main(String[] args) {
        //1
        List<Student> Students=new ArrayList<>();
        Students.add(new Student("Leyla",Grade.A));
        Students.add(new Student("Nurcan",Grade.B));
        Students.add(new Student("Aysel",Grade.A));


        //2
        Optional<Student> studentOpt = findByName("Leyla",Students);
        if (studentOpt.isPresent()) {
            System.out.println("Tapılan şagird: " + studentOpt.get());
        } else {
            System.out.println("Şagird tapılmadı");

        }
        //3
        List<Student> gradeStudents = findByGrade( Grade.A,Students);
        System.out.println(gradeStudents);
        //4
        ClassWork.removeStudentsByText(Students, "l");
        System.out.println(Students);

        //5
        Map<Grade, List<Student>> studentsByGrade = groupStudentsByGrade(Students);
        for (Map.Entry<Grade, List<Student>> entry : studentsByGrade.entrySet()) {
            System.out.println("Grade: " + entry.getKey() + ", Students: " + entry.getValue());}






    }

    //2
    public  static Optional<Student> findByName(String name,List<Student>Students){
        for (Student student : Students) {
            if(student.getName().equals(name)){
                return Optional.of(student);
            }

        }
        return  Optional.empty();
    }
    //3
    public static List<Student> findByGrade(Grade grade,List<Student> Students) {
        List<Student> studentsWithGrade = new ArrayList<>();
        for (Student student : Students) {
            if (student.getGrade() == grade) {
                studentsWithGrade.add(student);
            }

        }
        return studentsWithGrade;
    }
    //4
    public static void removeStudentsByText(List<Student> Students, String text) {
        Students.removeIf(student -> student.getName().contains(text));

    }
    //5
    public static Map<Grade,List<Student>> groupStudentsByGrade(List<Student>Students) {
        Map<Grade, List<Student>> map = new HashMap<>();
        for (Student student : Students) {
            Grade grade = student.getGrade();
            if (!map.containsKey(grade)) {
                map.put(grade, new ArrayList<>());
            }
            map.get(grade).add(student);
        }

        return map;

    }




}
