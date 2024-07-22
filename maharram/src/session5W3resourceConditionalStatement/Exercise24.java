//24. Write a Java program to generate the following @'s triangle.
//
//Test Data
//Input the number: 6
//Expected Output :
//
//      @
//     @@
//    @@@
//   @@@@
//  @@@@@
// @@@@@@
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
