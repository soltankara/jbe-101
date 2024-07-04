import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        System.out.print("Enter char you want to see index: ");
        char inputChar = sc.next().charAt(0);
        int index = findCharIndex(text, inputChar);
        if (index != -1) {
            System.out.println("Index of '" + inputChar + "' in the text '" + text + "' is: " + index);
        } else {
            System.out.println("'" + inputChar + "' not found in the text '" + text + "'");
        }
    }

    public static int findCharIndex(String text, char c) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}
