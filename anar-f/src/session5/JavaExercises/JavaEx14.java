package session5.JavaExercises;
import java.util.Scanner;
public class JavaEx14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <= n; i++) {
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
}
