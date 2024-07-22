//19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.
//       1
//      2 2
//     3 3 3
//    4 4 4 4
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
