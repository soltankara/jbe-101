package session5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = input.nextLine();
        String reversed = new StringBuilder(text).reverse().toString();
        if (text.equals(reversed)) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not palindrome");
        }
    }
}
