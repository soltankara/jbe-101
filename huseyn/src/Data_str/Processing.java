package Data_str;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Processing {
    private List<Student> students;

    public Processing(List<Student> students) {
        this.students = students;
    }

    public Optional<Student> getStudentByName(String name) {
        return students.stream()
                .filter(student -> student.getName().equals(name))
                .findFirst();
    }


    public List<Student> getStudentsByGrade(Grade grade) {
        return students.stream()
                .filter(student -> student.getGrade().equals(grade))
                .collect(Collectors.toList());
    }

    public void removeStudentsByNameContaining(String text) {
        students.removeIf(student -> student.getName().contains(text));
    }

    public Map<Grade, List<Student>> createStudentMapByGrade() {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getGrade));
    }
}