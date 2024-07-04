package Task_day_4;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text : ");
        String text = sc.next();
        System.out.print("Enter a index to replace : ");
        sc = new Scanner(System.in);
        int index = sc.nextInt();
        System.out.print("Enter a character you wanna replace with  : ");
        sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        char achar = text.charAt(index);
        String newstr = text.replace(achar,ch);
        System.out.println(newstr);



    }
}
