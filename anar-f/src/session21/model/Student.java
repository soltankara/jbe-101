package session21.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private Grade grade;
    private String name;

    public Student() {
    }

    public Student(Grade grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grade, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
