package Session21;

import Session21.Classes.GradeEnum;
import Session21.Classes.Student;
import Session21.Controller.StudentControllerImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StudentControllerImpl studentController = new StudentControllerImpl();
        List<String> studentNames = studentController.readName("javad/src/Session21/TextFiles/StudentName.txt");
        List<GradeEnum> studentGrades = studentController.readGrade("javad/src/Session21/TextFiles/StudentGrades.txt");

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < studentNames.size(); i++) {
            studentList.add(new Student(studentNames.get(i), studentGrades.get(i)));
        }

        for (Student student : studentList) {
            System.out.println(student.toString());
        }

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println(studentController.printSingleStudentByGivenName(studentList, "Cavad").toString());
        studentController.removeStudentIfContainsName(studentList, "Adil");
        System.out.println("-------------------------------");
        for (Student student : studentController.printStudentsByGivenGrade(studentList, GradeEnum.B)) {
            System.out.println(student.toString());
        }
        Map<GradeEnum, List<Student>> gradeToStudentsMap = studentController.groupStudentsByGrade(studentList);

        studentController.printGradeToStudentsMap(gradeToStudentsMap);
    }

}
