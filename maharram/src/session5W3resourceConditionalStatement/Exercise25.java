//25. Write a Java program to display the number rhombus structure.
//Test Data
//Input the number: 7
//Expected Output :
//      1
//     212
//    32123
//   4321234
//  543212345
// 65432123456
//7654321234567
// 65432123456
//  543212345
//   4321234
//    32123
//     212
//      1
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1; i <= number; i++) {
            for (int j = number - i; j < number; j++) {
                System.out.print(" ");
            }
            for (int j = number - i; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= number - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
