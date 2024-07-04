import java.util.Scanner;

public class Lesson5task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text : ");
        String text = sc.nextLine();
        String reversedText = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            reversedText += text.charAt(i);
        }

        if (text == reversedText) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not palindrome");
        }
    }
}