package session5;

import java.util.Scanner;

public class WhileLoopHw1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String s = sc.nextLine();
        StringBuilder strb = new StringBuilder(s);
        strb.reverse();
        if (s.equals(String.valueOf(strb))) {
            System.out.println(s + " is palindrome");
        } else System.out.println(s + " is not palindrome");
    }
}

