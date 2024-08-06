package session11W3resourceOOP;
import java.util.SortedMap;
public class School {
    private String[] classes;
    private String[] teachers;
    private String[] students;
    private int countOfClass;
    private int countOfTeachers;
    private int countOfStudents;

    public School(int maxCountOfTeachers, int maxCountOfStudents, int maxCountOfClasses) {
        this.classes = new String[maxCountOfClasses];
        this.students = new String[maxCountOfStudents];
        this.teachers = new String[maxCountOfTeachers];
        this.countOfClass = 0;
        this.countOfStudents = 0;
        this.countOfTeachers = 0;
    }

    public void addStudent(String student) {
        if (countOfStudents < students.length) {
            students[countOfStudents] = student;
            countOfStudents++;
            System.out.println(student + " added");
        } else {
            System.out.println("there is not enough place ");
        }
    }

    public void removeStudent(String student) {
        boolean found = false;
        for (int i = 0; i < countOfStudents; i++) {
            if (students[i].equals(student)) {
                found = true;
            }
            for (int j = i; j < countOfStudents - 1; j++) {
                students[j] = students[j + 1];
            }
            students[countOfStudents - 1] = null;
            countOfStudents--;
            System.out.println(student + " removed ");
            break;
        }
        if (!found) {
            System.out.println(student + "was not found ");
        }
    }

    public void addTeacher(String teacher) {
        if (countOfTeachers < teachers.length) {
            teachers[countOfTeachers] = teacher;
            countOfTeachers++;
            System.out.println(teacher + " added");
        } else {
            System.out.println("there is not enough place ");
        }
    }

    public void removeTeacher(String teacher) {
        boolean found = false;
        for (int i = 0; i < countOfTeachers; i++) {
            if (teachers[i].equals(teacher)) {
                found = true;
            }
            for (int j = i; j < countOfTeachers - 1; j++) {
                teachers[j] = teachers[j + 1];
            }
            teachers[countOfTeachers - 1] = null;
            countOfTeachers--;
            System.out.println(teacher + " removed ");
            break;
        }
        if (!found) {
            System.out.println(teacher + "was not found ");
        }
    }

    public void createClass(String className) {
        if (countOfClass < classes.length) {
            classes[countOfClass] = className;
            countOfClass++;
            System.out.println(className + " was creatted");
        } else {
            System.out.println("there is not enough place ");
        }
    }

    public void showStudents() {
        System.out.print("students :");
        for (int i = 0; i < countOfStudents; i++) {
            System.out.print(students[i] + "  ");
        }
        System.out.println();
    }

    public void showTeachers() {
        System.out.print("teachers :");
        for (int i = 0; i < countOfTeachers; i++) {
            System.out.print(teachers[i] + "  ");
        }
        System.out.println();
    }

    public void showClasses() {
        System.out.print("classes :");
        for (int i = 0; i < countOfClass; i++) {
            System.out.print(classes[i] + "  ");
        }
        System.out.println();
    }
}
