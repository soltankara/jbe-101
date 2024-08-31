package Session21;

import Session21.Classes.GradeEnum;
import Session21.Classes.Student;
import Session21.ServiceClasses.FileReaderService;
import Session21.ServiceClasses.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StudentServiceImpl studentService = new StudentServiceImpl();
        FileReaderService fileReaderService = new FileReaderService();
        List<FileReaderService.StudentGradePair> studentGradePairList = fileReaderService.readStudentData("javad/src/Session21/TextFiles/StudentData.txt");
        List<String> studentNames = fileReaderService.extractStudentNames(studentGradePairList);
        List<GradeEnum> studentGrades = fileReaderService.extractStudentGrades(studentGradePairList);
        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < studentNames.size(); i++) {
            studentList.add(new Student(studentNames.get(i), studentGrades.get(i)));
        }

        for (Student student : studentList) {
            System.out.println(student.toString());
        }

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println(studentService.printSingleStudentByGivenName(studentList, "Cavad").toString());
        studentService.removeStudentIfContainsName(studentList, "Adil");
        System.out.println("-------------------------------");
        for (Student student : studentService.printStudentsByGivenGrade(studentList, GradeEnum.B)) {
            System.out.println(student.toString());
        }
        Map<GradeEnum, List<Student>> gradeToStudentsMap = studentService.groupStudentsByGrade(studentList);

        studentService.printGradeToStudentsMap(gradeToStudentsMap);
    }

}
