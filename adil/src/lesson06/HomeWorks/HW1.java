package lesson06.HomeWorks;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        if (s.equals(String.valueOf(sb))) {
            System.out.println(s + " is palindrome");
        } else System.out.println(s + " is not palindrome");
    }
}
