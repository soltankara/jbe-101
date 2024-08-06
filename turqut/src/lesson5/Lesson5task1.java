package turqut.src.lesson5;

import java.util.Scanner;

public class Lesson5task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String reversedText = new StringBuilder(text).reverse().toString();
        
        if (text.equals(reversedText)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
    }
}
