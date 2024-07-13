package Classworks;
import java.util.Scanner;
public class PalindromeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (reversed == original) {
            System.out.println("Palindrome Number");
        }
        else System.out.println("Not a Palindrome Number");
    }
}
