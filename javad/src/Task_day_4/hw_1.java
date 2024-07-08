package Task_day_4;

import java.util.Scanner;

public class hw_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text : ");
        String text = sc.nextLine();
        System.out.print("Enter a index to replace : ");
        int index = sc.nextInt();
        System.out.print("Enter a character you wanna replace with  : ");
        char ch = sc.next().charAt(0);
        char achar = text.charAt(index);
        String newstr = text.replace(achar,ch);
        System.out.println(newstr);



    }
}
