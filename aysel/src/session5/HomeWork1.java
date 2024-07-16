package session5;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        StringBuilder reversedstring = new StringBuilder(string).reverse();
        if (reversedstring.equals(string)) {
            System.out.println("String is Palendrom");
        }else {
            System.out.println("String is not Palendrom");
        }
    }
}
