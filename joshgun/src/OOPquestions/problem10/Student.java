package OOPquestions.problem10;
/*Write a Java program to create a class called "Student" with a name, grade, and courses
attributes, and methods to add and remove courses.*/

import java.util.ArrayList;

public class Student {
    private String name;
    private int grade;
    public ArrayList<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void getInformation() {
        System.out.println(name + " " + grade);
    }

    public ArrayList getCourses() {
        return courses;
    }
}
