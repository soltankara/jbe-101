package turqut.src.w3oop;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();

        Student2 student1 = new Student2("Ali", 12);
        Student2 student2 = new Student2("Ehmed", 13);
        Student2 student3 = new Student2("Peri", 15);
        Student2 student4 = new Student2("Orxan", 14);

        Teacher teacher1 = new Teacher("Mehriban", "Math");
        Teacher teacher2 = new Teacher("Xatire", "Chemistry");
        Teacher teacher3 = new Teacher("Sefa", "Informatics");

        school.addStudents(student1);
        school.addStudents(student2);
        school.addStudents(student3);
        school.addStudents(student4);

        school.addTeachers(teacher1);
        school.addTeachers(teacher2);
        school.addTeachers(teacher3);

        Class class1 = new Class("Math", teacher1);
        Class class2 = new Class("Chemistry", teacher2);
        Class class3 = new Class("Informatics", teacher3);

        school.addClasses(class1);
        school.addClasses(class2);
        school.addClasses(class3);

        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student4);

        class2.addStudent(student2);
        class2.addStudent(student3);

        class3.addStudent(student1);
        class3.addStudent(student2);
        class3.addStudent(student3);
        class3.addStudent(student4);

        System.out.println("School information : ");
        System.out.println("Number of students : " + school.getStudents().size());
        System.out.println("Number of teachers : " + school.getTeachers().size());
        System.out.println("Number of classes : " + school.getClasses().size());
        System.out.println();

        System.out.println("Classes informations : ");
        System.out.println();
        for (Class classs : school.getClasses()) {
            System.out.println("Name of class : " + classs.getClassName());
            System.out.println("Teacher name : " + classs.getTeacher().getName());
            System.out.println("Number of students : " + classs.getStudents().size());
            System.out.println();
        }
    }
}
