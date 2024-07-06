package session5;

import java.util.Scanner;

public class cube {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for(int i=1;i<=number;i++){
            int cube = i*i*i;
            System.out.println("Number is : " + i + " and cube of " + i + " is " + cube);
        }
    }
}
