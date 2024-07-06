package Homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a text : ");
        StringBuilder word = new StringBuilder(scanner.next());
        String reserve = word.toString().toLowerCase();
        String reverse = new StringBuilder(word).reverse().toString().toLowerCase();
        if (reserve.equals(reverse)) {
            System.out.printf("%s is a palindrome.%n", word);
        }
        else {
            System.out.printf("%s is not a palindrome.%n", word);
        }

    }
}

