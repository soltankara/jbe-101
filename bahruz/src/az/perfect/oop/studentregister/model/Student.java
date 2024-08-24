package az.perfect.oop.studentregister.model;

public class Student {

    private String name;
    private String surname;
    private Integer age;
    private String group;

    public Student() {
    }

    public Student(String name, String surname, String ageStr, String group) {
        this.name = name;
        this.surname = surname;
        try {
            this.age = Integer.parseInt(ageStr);
        } catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("Invalid age. Please enter a numeric value for age.");

        }
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student { " +
                "name: " + name + " ,surname: " + surname + " ,age=" + age + " ,group: " + group + " }";
    }
}
