package turqut.src.stringAndOperators;

import java.util.Scanner;

public class TurqutScHw1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text : ");
        String text = sc.nextLine();

        System.out.print("Enter index you want to replace : ");
        int index = sc.nextInt();

        System.out.print("Enter character you want to replace with : ");
        char replaceChar = sc.next().charAt(0);

        String replacedText = text.substring(0, index) + replaceChar + text.substring(index + 1);

        System.out.println(replacedText);


    }
}