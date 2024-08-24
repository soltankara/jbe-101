package module1.session5.JavaExercises;
import java.util.Scanner;
public class JavaEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the 1st number: ");
        int a = scanner.nextInt();
        System.out.print("Input the 2nd number: ");
        int b = scanner.nextInt();
        System.out.print("Input the 3rd number: ");
        int c = scanner.nextInt();
        if (a > b && a > c) System.out.println("The greatest: " + a);
        else if (b > a && b > c) System.out.println("The greatest: " + b);
        else System.out.println("The greatest: " + c);
    }
}
