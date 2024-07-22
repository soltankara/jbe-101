//6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to three decimal places.
//Test Data
//Input floating-point number: 25.586
//Input floating-point another number: 25.589
//Expected Output :
//They are different
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number ");
        System.out.print("number 1 : ");
        double number1 = sc.nextDouble();
        System.out.print("number 2 : ");
        double number2 = sc.nextDouble();
        number1 = Math.round(number1 * 1000);
        number1 = number1 / 1000;
        number2 = Math.round(number2 * 1000);
        number2 = number2 / 1000;
        if (number1 == number2) {
            System.out.println("numbers are equal ");
        } else {
            System.out.println("numbers are not equal");
        }
    }
}
