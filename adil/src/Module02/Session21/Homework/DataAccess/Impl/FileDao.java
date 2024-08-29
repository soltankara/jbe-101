package Module02.Session21.Homework.DataAccess.Impl;

import Module02.Session21.Homework.DataAccess.Dao;
import Module02.Session21.Homework.Model.Grade;
import Module02.Session21.Homework.Model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.groupingBy;

public class FileDao implements Dao<Student> {
    private static final String FILEPATH =
            "adil/src/Module02/Session21/Homework/DataAccess/Impl/Student.txt";
    private static List<Student> students = new ArrayList<>();

    public FileDao() {
        students = findAll();
    }

    @Override
    public void save(Student student) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILEPATH, true))) {
            bw.write(student.getName() + ", " + student.getGrade() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        students.add(student);
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILEPATH))) {
            while (br.ready()) {
                String line = br.readLine();
                String name = line.substring(0, line.indexOf(","));
                String grade = line.substring(line.indexOf(",") + 2);
                students.add(new Student(name, Grade.valueOf(grade)));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public Optional<Student> findByName(String name) {
        return students.stream().filter(student -> student.getName().equalsIgnoreCase(name))
                .findFirst();
    }

    public List<Student> findAllByGrade(Grade grade) {
        return students.stream().filter(student -> student.getGrade().equals(grade)).toList();
    }

    public void deleteBySubstring(String substring) {
        students = students.stream().filter(student -> !student.getName()
                .contains(substring)).toList();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILEPATH))) {
            for (Student student : students) {
                writer.write(student.getName() + ", " + student.getGrade() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<Grade, List<Student>> createMapByGrade() {
        return students.stream().collect(groupingBy(Student::getGrade));
    }
}
