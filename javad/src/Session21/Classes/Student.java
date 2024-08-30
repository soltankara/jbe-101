package Session21.Classes;

public class Student {
    private String name;
    private GradeEnum grade;

    public Student(String name, GradeEnum grade) {
        this.name = name;
        this.grade = grade;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return STR."Student{name='\{name}\{'\''}, grade=\{grade}\{'}'}";
    }

    public GradeEnum getGrade() {
        return grade;
    }

    public void setGrade(GradeEnum grade) {
        this.grade = grade;
    }
}
