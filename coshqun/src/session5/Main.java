package session5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter a text: ");
        String text = scanner.nextLine();

        System.out.println("Enter index you want to replace: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter character yo want to replace with: ");
        char character = scanner.next().charAt(0);

        StringBuilder text2 = new StringBuilder(text);
        text2.setCharAt(index,character);

        System.out.println(text2.toString());
    }
}