import java.util.ArrayList;

public class Class {
    private String className;
    private Teacher teacher;
    private ArrayList<Student2> students;

    public Class(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<Student2>();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student2> getStudents() {
        return students;
    }

    public void addStudent(Student2 student) {
        students.add(student);
    }

    public void removeStudent(Student2 student) {
        students.remove(student);
    }
}
