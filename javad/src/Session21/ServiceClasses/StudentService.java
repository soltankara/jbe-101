package Session21.ServiceClasses;

import Session21.Classes.GradeEnum;
import Session21.Classes.Student;

import java.util.List;
import java.util.Map;


public interface StudentService {
    Student printSingleStudentByGivenName(List<Student> studentList, String name);

    List<Student> printStudentsByGivenGrade(List<Student> studentList, GradeEnum grade);

    void removeStudentIfContainsName(List<Student> studentList, String name);

    List<String> readName(String filePath);

    List<GradeEnum> readGrade(String filePath);

    Map<GradeEnum, List<Student>> groupStudentsByGrade(List<Student> studentList);

    void printGradeToStudentsMap(Map<GradeEnum, List<Student>> gradeToStudentsMap);
}
