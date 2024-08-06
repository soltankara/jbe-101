import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        StringBuilder text2 = new StringBuilder(text);
        String reversed = text2.reverse().toString();

        if (text.equals(reversed)) {
            System.out.println(text + " is palindrome");
        } else System.out.println(text + " is not palindrome");
    }
}

