package session5;

import java.util.Scanner;

public class calculate {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for(int i=0;i<=number;i++){
            System.out.println(number + " X " + i + " = " + number*i);
        }
    }
}
