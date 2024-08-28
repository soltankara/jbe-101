package collections.dataStructure2ClassExercise;

public class Student {
    private String name;
    private Grade grade;

    public Student(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', grade=" + grade + "}";
    }

    public String toFileString() {
        return name + "," + grade;
    }

    public static Student fromFileString(String fileString) {
        String[] parts = fileString.split(",");
        String name = parts[0];
        Grade grade = Grade.valueOf(parts[1]);
        return new Student(name, grade);
    }
}