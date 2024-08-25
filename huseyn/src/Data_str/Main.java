package Data_str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
            List<Student> studentList = new ArrayList<>(Arrays.asList(
                    new Student("Huseyn", Grade.A),
                    new Student("Rafa", Grade.B),
                    new Student("Snape", Grade.B),
                    new Student("Harry", Grade.C),
                    new Student("Alex", Grade.B)
            ));

            Processing manager = new Processing(studentList);

            System.out.println("Get student by name 'Huseyn': " + manager.getStudentByName("Huseyn"));

            System.out.println("Students with grade 'C': " + manager.getStudentsByGrade(Grade.C));

            manager.removeStudentsByNameContaining("Alex");
            System.out.println("Students after removing those with 'Alex': " + studentList);

            Map<Grade, List<Student>> studentMap = manager.createStudentMapByGrade();
            System.out.println("Student map by grade: " + studentMap);
    }
}