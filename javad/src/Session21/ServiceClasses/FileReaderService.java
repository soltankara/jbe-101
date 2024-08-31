package Session21.ServiceClasses;

import Session21.Classes.GradeEnum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService {
    public List<StudentGradePair> readStudentData(String filePath) {
        List<StudentGradePair> studentGradePairs = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String studentData;
            while ((studentData = bufferedReader.readLine()) != null) {
                String[] parts = studentData.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    GradeEnum grade = GradeEnum.valueOf(parts[1].trim());
                    studentGradePairs.add(new StudentGradePair(name, grade));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return studentGradePairs;
    }

    public List<String> extractStudentNames(List<StudentGradePair> studentGradePairs) {
        List<String> names = new ArrayList<>();
        for (StudentGradePair pair : studentGradePairs) {
            names.add(pair.getName());
        }
        return names;
    }

    public List<GradeEnum> extractStudentGrades(List<StudentGradePair> studentGradePairs) {
        List<GradeEnum> grades = new ArrayList<>();
        for (StudentGradePair pair : studentGradePairs) {
            grades.add(pair.getGrade());
        }
        return grades;
    }

    public static class StudentGradePair {
        private String name;
        private GradeEnum grade;

        public StudentGradePair(String name, GradeEnum grade) {
            this.name = name;
            this.grade = grade;
        }

        public StudentGradePair() {

        }

        public String getName() {
            return name;
        }

        public GradeEnum getGrade() {
            return grade;
        }
    }
}


