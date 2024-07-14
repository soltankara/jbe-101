package session5.JavaExercises;
import java.util.Scanner;
public class JavaEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input floating-point number: ");
        double a = scanner.nextDouble();
        System.out.print("Input floating-point another number: ");
        double b = scanner.nextDouble();
        a = Math.round(a * 1000);
        b = Math.round(b * 1000);
        if (a == b) {
            System.out.println("They are same");
        } else System.out.println("They are different");
    }
}
