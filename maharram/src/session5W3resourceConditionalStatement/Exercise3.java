//3. Write a Java program that takes three numbers from the user and prints the greatest number.
//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87
//Expected Output :
//The greatest: 87
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 number  ");
        System.out.print("number 1 : ");
        double number1 = sc.nextDouble();
        System.out.print("number 2 : ");
        double number2 = sc.nextDouble();
        System.out.print("number 3 : ");
        double number3 = sc.nextDouble();
        double greatest = number1;
        if (number2 > number1) {
            greatest = number2;
        }
        if (number3 > number1) {
            greatest = number3;
        }
        System.out.println("greatest number : " + greatest);
    }
}
