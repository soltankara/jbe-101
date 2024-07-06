package session5;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String ch = scanner.nextLine();

        if (ch.length() > 1) System.out.println("Error");
        else if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) {
            System.out.println(ch + " is vowel");
        } else System.out.println(ch + " is consonant");
    }
}
