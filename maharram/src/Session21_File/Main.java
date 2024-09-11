package Session21_File;
public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.addStudent(new Student("Saleh", Grade.A));
        service.addStudent(new Student("Ali", Grade.C));
        service.addStudent(new Student("Shammad", Grade.A));
        service.addStudent(new Student("Muhammed", Grade.B));
        service.addStudent(new Student("Javad", Grade.D));
        service.addStudent(new Student("Sabuhi", Grade.A));
        service.addStudent(new Student("Turqut", Grade.C));
        service.addStudent(new Student("Bahruz", Grade.B));
        service.addStudent(new Student("Araz", Grade.D));
        service.addStudent(new Student("Maharram", Grade.E));

        service.updateFile();
        System.out.print("Students : ");
        service.printStudents();

        System.out.println(service.getStudentByName("Bahruz"));
        System.out.println(service.getStudentByName("Sabuhi"));

        service.removeStudentsByNameContains("a");
        service.updateFile();
        System.out.println("students removed");
        service.printStudents();
        System.out.print("students group by grade : ");
        System.out.println(service.getGradeMap());
    }
}
