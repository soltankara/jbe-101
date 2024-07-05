import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        System.out.print("Enter char you want to see index: ");
        String input = sc.nextLine();

        char charToFind = input.charAt(0);

        int index = -1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == charToFind) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.printf("Index of '%c' in '%s' is: %d\n", charToFind, text, index);
        } else {
            System.out.printf("Character '%c' not found in '%s'\n", charToFind, text);
        }

    }
}
