package Session21.Controller;

import Session21.Classes.GradeEnum;
import Session21.Classes.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentControllerImpl implements StudentController {

    @Override
    public Student printSingleStudentByGivenName(List<Student> studentList, String name) {
        Optional<Student> found = studentList.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst();
        return found.orElse(null);
    }

    @Override
    public List<Student> printStudentsByGivenGrade(List<Student> studentList, GradeEnum grade) {
        return studentList.stream()
                .filter(student -> student.getGrade().equals(grade))
                .toList();
    }

    @Override
    public void removeStudentIfContainsName(List<Student> studentList, String name) {
        studentList.removeIf(student -> student.getName().contains(name));
    }

    @Override
    public List<String> readName(String filePath) {
        List<String> student = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String studentData;
            while ((studentData = bufferedReader.readLine()) != null) {
                student.add(studentData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return student;
    }

    @Override
    public List<GradeEnum> readGrade(String filePath) {
        List<GradeEnum> gradeList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String studentData;
            while ((studentData = bufferedReader.readLine()) != null) {
                gradeList.add(GradeEnum.valueOf(studentData));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gradeList;
    }

    @Override
    public Map<GradeEnum, List<Student>> groupStudentsByGrade(List<Student> studentList) {
        return studentList.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
    }

    @Override
    public void printGradeToStudentsMap(Map<GradeEnum, List<Student>> gradeToStudentsMap) {
        gradeToStudentsMap.forEach((grade, students) -> {
            System.out.println("-------------------------");
            students.forEach(student ->
                    System.out.printf("Name: %-10s | Grade: %s%n", student.getName(), student.getGrade())
            );
            System.out.println();
        });
    }

}
