package az.perfect.session4;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {

        //SCANNER HOMEWORK2

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text:");
        String etext = sc.nextLine();
        System.out.println("Enter char you want to see index:");
        int inedxc = sc.nextInt();
        char seeChar = etext.charAt(inedxc);
        System.out.println("seeChar: " + seeChar);

        System.out.println("Enter a text:");
        String etext1 = sc.nextLine();
        System.out.println("Enter char you want to see index:");
        char seeCharindex = sc.next().charAt(0);
        int index = etext1.indexOf(seeCharindex);
        if (index >= 0) {
            System.out.println(index);
        } else {
            System.out.println("Character doesn't found!");
        }
    }
}
