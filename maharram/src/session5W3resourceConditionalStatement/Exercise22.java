//22. Write a Java program to display Pascal's triangle.
//Test Data
//Input number of rows: 5
//Expected Output :
//Input number of rows: 5
//      1
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) +" ");
            }
            System.out.println();
        }
    }
    public static int pascal(int i, int j) {
        if (j == 0 || j == i)
            return 1;
        return pascal(i - 1, j - 1) + pascal(i - 1, j);
    }
}
