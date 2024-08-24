package az.perfect.oop.studentregister.util;

import az.perfect.oop.studentregister.data.Base;
import az.perfect.oop.studentregister.exception.StudentException;
import az.perfect.oop.studentregister.model.Student;

public class StudentUtil {
    public static Student fillStudent() {
        String name = InputUtil.getText("Enter the name of the student");
        String surname = InputUtil.getText("Enter the surname of the student");
        String age = InputUtil.getText("Enter the age of the student");
        String group = InputUtil.getText("Enter the group of the student");
        return new Student(name, surname, age, group);
    }

    public void studentRegistration() {
        while (true) {
            try {
                Integer count = InputUtil.getCount("How many students do you want to add?");
                if (count <= 0) {
                    throw new StudentException("Enter the number correctly!");
                }
                Base.students = new Student[count];
                for (int i = 0; i < count; i++) {
                    System.out.println(i + 1 + ".Registration");
                    Base.students[i] = StudentUtil.fillStudent();
                }
                break;
            } catch (StudentException | IllegalArgumentException studentException) {
                System.out.println(studentException.getLocalizedMessage());
            }
        }
    }

    public void showStudent() {
        try {
            sizeNullStudent();
            for (int i = 0; i < Base.students.length; i++) {
                if (Base.students[i] != null) {
                    System.out.println(i + 1 + "." + Base.students[i]);
                }
            }
        } catch (StudentException studentException) {
            System.out.println(studentException.getLocalizedMessage());
        }
    }

    public void findStudent() {
        try {
            sizeNullStudent();
            String text = InputUtil.getText("Type what you want to search for");
            for (int i = 0; i < Base.students.length; i++) {
                if (Base.students[i].getName().equals(text) ||
                        Base.students[i].getSurname().equals(text) ||
                        Base.students[i].getGroup().equals(text)) {
                    System.out.println(Base.students[i]);
                } else {
                    throw new IllegalArgumentException("No student was found matching the information you entered!");
                }
            }
        } catch (StudentException studentException) {
            System.out.println(studentException.getLocalizedMessage());
        }
    }

    public static void sizeNullStudent() {
        if (Base.students == null || Base.students.length == 0) {
            throw new StudentException("There are no students listed");
        }
    }

    public void editStudent() {
        while (true) {
            try {
                if (Base.students == null || Base.students.length == 0) {
                    System.out.println("There are no students listed.");
                    return;
                }
                showStudent();
                Integer studentNumber = InputUtil.getCount("Enter the number of the student whose information you want to change") - 1;
                if (studentNumber < 0 || studentNumber >= Base.students.length) {
                    throw new IllegalArgumentException("Invalid number!");
                }
                String newtext = InputUtil.getText("Change: 1.name 2.surname 3.age 4.group");
                Student student = Base.students[studentNumber];
                switch (newtext) {
                    case "name":
                        student.setName(InputUtil.getText("Enter the new name"));
                        break;
                    case "surname":
                        student.setSurname(InputUtil.getText("Enter the new surname"));
                        break;
                    case "age":
                        student.setAge(InputUtil.getCount("Enter the new age"));
                        break;
                    case "group":
                        student.setGroup(InputUtil.getText("Enter the new group"));
                        break;
                    default:
                        System.out.println("Invalid option!");
                        continue;
                }
                System.out.println("Student information updated successfully.");
                return;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println(illegalArgumentException.getLocalizedMessage());
            }
        }
    }

    public void deleteStudent() {
        while (true) {
            try {
                if (Base.students == null || Base.students.length == 0) {
                    System.out.println("There are no students listed.");
                    return;
                }
                showStudent();
                Integer deleteNumber = InputUtil.getCount("Enter the student number you want to delete") - 1;
                if (deleteNumber < 0 || deleteNumber >= Base.students.length) {
                    throw new StudentException("Invalid number!!");
                }
                Base.students = removeStudentFromArray(Base.students, deleteNumber);
                System.out.println("Student number " + (deleteNumber + 1) + "'s data has been deleted");
                if (Base.students.length == 0) {
                    System.out.println("There are no more students listed.");
                    return;
                }
                break;
            } catch (StudentException |IllegalArgumentException studentException) {
                System.out.println(studentException.getLocalizedMessage());
            }
        }
    }

    private Student[] removeStudentFromArray(Student[] students, int indexToRemove) {
        Student[] newStudents = new Student[students.length - 1];
        for (int i = 0, j = 0; i < students.length; i++) {
            if (i != indexToRemove) {
                newStudents[j++] = students[i];
            }
        }
        return newStudents;
    }

}

