package session19;

public class Student {
    private String studentName;
    private Grades studentGrade;
    public Student(String studentName, Grades studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }
    public String getStudentName() {
        return studentName;
    }

    public Grades getStudentGrade() {
        return studentGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentGrade='" + studentGrade + '\'' +
                '}';
    }
}
