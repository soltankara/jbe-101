package lesson05;

import java.util.Scanner;

public class ScannerHW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        System.out.print("Enter index you want to replace: ");
        int index = scanner.nextInt();
        System.out.print("Enter character you want to replace with: ");
        String ch = scanner.next();
        System.out.println(text.substring(0, index) + ch + text.substring(index+1));
    }
}
