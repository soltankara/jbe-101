package Session5;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        System.out.print("Enter text : ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String text2 = text.toLowerCase();
        StringBuilder newText = new StringBuilder(text2).reverse();
        if(newText.toString().equals(text2))  System.out.println(text+ " is palindrome");
        else System.out.println(text+ " is not palindrome");



    }
}
