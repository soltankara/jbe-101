//5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
//Test Data
//Input number: 3
//Expected Output :
//Wednesday
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number between 1 and 7  : ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("you entered wrong number pls enter available number ");
                break;
        }
    }
}
