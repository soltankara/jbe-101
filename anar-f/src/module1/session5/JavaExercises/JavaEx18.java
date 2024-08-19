package module1.session5.JavaExercises;
import java.util.Scanner;
public class JavaEx18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }

    }
}
