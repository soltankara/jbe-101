package session4;
//Scanner homework 1

import java.util.Scanner;

public class Main1 {
    private static Scanner scanner;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("enter yout text ");
        String text = scanner.nextLine();


        System.out.print("enter index which you want change: ");
        int index = scanner.nextInt();
        scanner.nextLine();


        System.out.print(" enter what you want to change ");
        String newChar = scanner.nextLine();


        String newtext = text.substring(0, index) + newChar + text.substring(index + 1);


        System.out.println("newtext " + newtext);


        scanner.close();


    }
}

