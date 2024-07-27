package session11W3resourceOOP;

public class Student {
    private String name;
    private String[] courses;
    private int grade;
    private int countOfCourse;
    public Student(String name, int grade, int maxCourses) {
        this.name = name;
        this.grade = grade;
        this.courses = new String[maxCourses];
        this.countOfCourse = 0;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String[] getCourses() {
        return courses;
    }
    public void addCourse(String course) {
        if (countOfCourse < courses.length) {
            courses[countOfCourse] = course;
            countOfCourse++;
            System.out.println(course + " added ");
        } else {
            System.out.println("there is no enough place for course");
        }
    }
    public void removeCourse(String course) {
        boolean found = false;

        for (int i = 0; i < countOfCourse; i++) {
            if (courses[i].equals(course)) {
                found = true;

                for (int j = i; j < countOfCourse - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                courses[countOfCourse - 1] = null;
                countOfCourse--;
                System.out.println(course + " removed ");
                break;
            }
        }
        if (!found) {
            System.out.println(course + " was not found ");
        }
    }
    public void showCourse(){
        System.out.print("courses :");
        for (int i = 0; i < countOfCourse; i++) {
            System.out.print(courses[i]+"  ");
        }
        System.out.println();
    }
    public void showStudentInfo(){
        System.out.println("name :"+ name);
        System.out.println("grade :"+grade);
        showCourse();
    }
}
