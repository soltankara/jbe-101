package Student;

public class Students {
    private String name;
    private String grade;

    public Students(String name, String  grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
    
}
