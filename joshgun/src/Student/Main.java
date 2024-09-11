package Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<Students>();

        Students Anar = new Students("Anar", "A");
        Students Adil = new Students("Adil", "B");
        Students Joshgun = new Students("Joshgun", "A");
        students.add(Anar);
        students.add(Adil);
        students.add(Joshgun);

//        System.out.println(findByName("Anar", students).orElseThrow(null));
        System.out.println(findByGrade("A", students));
    }

    static Optional<Students> findByName(String name, List<Students> students){
        for (Students student : students) {
            if(student.getName().equals(name)){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    static List<Students> findByGrade(String grade, List<Students> students){
        List<Students> grades = new ArrayList<Students>();
        for (Students student : students) {
            if(student.getGrade().equals(grade)){
                grades.add(student);
            }
        }
        return grades;
    }

    static void removeStudent(Students student, List<Students> students){
        for (Students students1 : students) {
            if(student.getName().equals(students)){
                students.remove(student);
            }
        }
    }

    static Map<String, Integer> countStudentsByGrade(List<Students> students) {
        Map<String, Integer> gradeMap = new HashMap<>();
        for (Students student : students) {
            gradeMap.put(student.getGrade(), gradeMap.getOrDefault(student.getGrade(), 0) + 1);
        }
        return gradeMap;
    }


    private static void delete(List<Students> students, String substring) {
        students.removeIf(student -> student.getName().contains(substring));
    }
}
