//26. Write a Java program to display the following character rhombus structure.
//Test Data
//Input the number: 7
//Expected Output :
//      A
//     ABA
//    ABCBA
//   ABCDCBA
//  ABCDEDCBA
// ABCDEFEDCBA
//ABCDEFGFEDCBA
// ABCDEFEDCBA
//  ABCDEDCBA
//   ABCDCBA
//    ABCBA
//     ABA
//      A
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
        for (int i = number - 1; i >= 1; i--) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) ('A' + j));
            }
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char) ('A' + j));
            }
            System.out.println();
        }
    }
}
