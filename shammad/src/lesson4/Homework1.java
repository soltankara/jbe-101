package lesson4;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //Note: program is case sensitive.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        System.out.println(sb);
        System.out.println(text.equals(sb.toString()) ? (text + " is palindrome") : (text + " is not palindrome"));
    }
}
