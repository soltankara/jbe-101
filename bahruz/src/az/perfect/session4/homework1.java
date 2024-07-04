package az.perfect.session4;

import java.util.Scanner;

public class homework1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //SCANNER HOMEWORK1
        System.out.println("Enter a text:");
        String hometext2 = sc.nextLine();
        System.out.println("Enter index you want to replace:");
        int index = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter character you want to replace with:");
        char replaceChar = sc.nextLine().charAt(0);
        if (index >= 0 && index < hometext2.length()) {
            String newtext = hometext2.substring(0, index) + replaceChar + hometext2.substring(index+1);
            System.out.println(newtext);

        } else {
            System.out.println("Index out of bounds!!");
        }
    }
}
