//29. Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
//Test Data
//Input an integer number less than ten billion: 125463
//Expected Output :
//Number of digits in the number: 6
package session5W3resourceConditionalStatement;
import java.util.Scanner;
public class Exercise29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number : ");
        int number =sc.nextInt();
        int a;
        int b;
        int counter=0;
        while(number>0){
           a= number%10;
           b=number/10;
           counter++;
           number=b;
        }
        System.out.println("the number of digits of a number : "+counter);
    }
}
