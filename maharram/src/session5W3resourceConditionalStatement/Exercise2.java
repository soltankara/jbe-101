//2. Write a Java program to solve quadratic equations (use if, else if and else).
//Test Data
//Input a: 1
//Input b: 5
//Input c: 1
//Expected Output :
//The roots are -0.20871215252208009 and -4.7912878474779195
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for quadratic equatins ");
        System.out.print("number 1(a) : ");
        double a = sc.nextDouble();
        System.out.print("number 2(b) : ");
        double b = sc.nextDouble();
        System.out.print("number 3(c) : ");
        double c = sc.nextDouble();
        double result = b * b - 4 * a * c;
        if (result > 0) {
            double x1 = -b + Math.pow(result, 0.5) / 2 * a;
            double x2 = -b - Math.pow(result, 0.5) / 2 * a;
            System.out.println("the roots :  x1 = " + x1 + "  x2 = " + x2);
        } else if (result == 0) {
            double x1 = -b / (2 * a);
            double x2 = x1;
            System.out.println("the both roots are same :  x1,x2 = " + x1);
        } else {
            System.out.println("the quadratic equations has no real roots ");
        }
    }
}
