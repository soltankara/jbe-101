import java.util.ArrayList;

public class School {
    private ArrayList<Student2> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<Class> classes;

    public School() {
        this.students = new ArrayList<Student2>();
        this.teachers = new ArrayList<Teacher>();
        this.classes = new ArrayList<Class>();
    }

    public ArrayList<Student2> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<Class> getClasses() {
        return classes;
    }

    public void addStudents(Student2 student) {
        students.add(student);
    }

    public void removeStudent(Student2 student) {
        students.remove(student);
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeachers(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void addClasses(Class classs) {
        classes.add(classs);
    }

    public void removeClasses(Class classs) {
        classes.remove(classs);
    }
}
