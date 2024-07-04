package Task_day_4;

import java.util.Scanner;

public class hw_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text : ");
        String text = sc.next();
        sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char index = sc.next().charAt(0);
        if(text.indexOf(index)==-1) System.out.println("character is not found!");
        else System.out.println("index of character you entered is : "+ text.indexOf(index));
    }


}
