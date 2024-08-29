package session21;

import session21.model.Grade;

public class Application {
    public static void main (String[] args) {
        StudentManager studentManager = new StudentManager();
        System.out.println(studentManager.getByName("Anar"));
        System.out.println(studentManager.findByGrade(Grade.A));
        studentManager.remove("Kamil");
        studentManager.findByName("Orxan");
        studentManager.getStudentsByGrade().forEach((grade, students) -> {
            System.out.println(grade + " => " + students);
        });
    }

}
