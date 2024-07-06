package src.session5.JavaExercises;
import java.util.Scanner;

public class JavaEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println("The number is positive");
        }
        else System.out.println("The number is negative");
    }
}
