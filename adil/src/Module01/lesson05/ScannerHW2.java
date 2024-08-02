package Module01.lesson05;

import java.util.Scanner;

public class ScannerHW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        System.out.print("Enter char you want to see index: ");
        String ch = scanner.next();
        System.out.println(text.indexOf(ch));
    }
}
