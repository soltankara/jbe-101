package session5;

import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum=0;

        for (int i = 1; i <= number; i++) {
            sum+=i;
            System.out.println(i);
        }
        System.out.println("The sum of them is " + sum);
    }
}
