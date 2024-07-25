//17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.
//The pattern is as follows :
//1
//22
//333
//4444
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
