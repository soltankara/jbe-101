package session11;

public class Student {
    private String name;
    private int grade;
    private String[] courses;
    private int courseCount;

    public Student(String name, int grade, int capacity) {
        this.name = name;
        this.grade = grade;
        this.courses = new String[capacity];
        this.courseCount = 0;
    }

    public void addCourse(String course) {
        if (courseCount < courses.length) {
            courses[courseCount++] = course;
        } else {
            System.out.println("there is no place");
        }
    }

    public void removeCourse(String course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].equals(course)) {
                courses[i] = courses[courseCount - 1];
                courses[courseCount - 1] = null;
                return;
            } else {
                System.out.println("course not found");
            }
        }
    }

    public void printCourses() {
        System.out.println("Courses: ");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i]);
        }
    }


}
