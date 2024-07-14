package session5;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();

        if (text.contentEquals(sb) ) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not palindrome");
        }
    }
}
