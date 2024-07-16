package src;

import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text:");
        String text = sc.nextLine();
        String reversed = new StringBuilder(text).reverse().toString();
        if (text.equalsIgnoreCase(reversed)) {
            System.out.println(text + "is a polindrome");
        } else
            System.out.println(text + "is not a polindrome");
    }
}


