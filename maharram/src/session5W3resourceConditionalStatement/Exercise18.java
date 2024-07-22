//18. Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.
//The pattern like :
//1
//2 3
//4 5 6
//7 8 9 10
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(b+++" ");
            }
            System.out.println();
        }
    }
}
