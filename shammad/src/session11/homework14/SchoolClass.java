package session11.homework14;

import java.util.ArrayList;

public class SchoolClass {
    private String className;
    private Teacher teacher;
    private ArrayList<Student> students;

    public SchoolClass(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<Student>();
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void displayClassInfo(){
        System.out.println(className + " class information:");
        System.out.println("Class name: " + className);
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Number of students: " + students.size());
        System.out.println();
    }

    @Override
    public String toString() {
        return "SchoolClass{" +
                "className='" + className + '\'' +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
