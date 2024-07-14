package az.perfect.truing.session5;

import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = sc.nextLine();
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);

        }

        if (text.equalsIgnoreCase(reverse)) {
            System.out.println("Text is a palindrome ");
        } else {
            System.out.println("Text is not a palindrome ");
        }

    }
}

