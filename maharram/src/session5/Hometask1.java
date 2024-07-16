package session5;

import java.util.Scanner;

public class Hometask1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter text : ");
        String text = sc.nextLine();

        String reversetext = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(reversetext)) {
            System.out.println("text is palindrome");
        } else {
            System.out.println("text is not polindrome");
        }
        sc.close();
    }
}