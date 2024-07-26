package session11.homework14;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;
    private ArrayList<SchoolClass> classes;

    public School() {
        this.students = new ArrayList<Student>();
        this.teachers = new ArrayList<Teacher>();
        this.classes = new ArrayList<SchoolClass>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void addClass(SchoolClass schoolClass) {
        classes.add(schoolClass);
    }

    public void removeClass(SchoolClass schoolClass) {
        classes.remove(schoolClass);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public ArrayList<SchoolClass> getClasses() {
        return classes;
    }

    public void displaySchoolInfo(){
        System.out.println("Number of students: " + students.size());
        System.out.println("Number of teachers: " + teachers.size());
        System.out.println("Number of classes: " + classes.size());
        System.out.println();
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", teachers=" + teachers +
                ", classes=" + classes +
                '}';
    }
}
