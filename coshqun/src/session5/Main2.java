package session5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        System.out.println("Enter char you want to see index: ");
        char character = scanner.next().charAt(0);
        int index = text.indexOf(character);
        System.out.println();
    }
}
