package az.perfect.session4;

import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {

        //SCANNER HOMEWORK1
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String hometext = sc.nextLine();
        System.out.println("Enter index you want to replace:");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter character you want to replace with:");
        char replaceChar = sc.nextLine().charAt(0);
        if (index >= 0 && index < hometext.length()) {
            String newtext = hometext.substring(0, index) + replaceChar + hometext.substring(index+1);
            System.out.println(newtext);

        } else {
            System.out.println("Index out of bounds!!");
        }
    }
}
