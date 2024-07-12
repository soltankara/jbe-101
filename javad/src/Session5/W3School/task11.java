package Session5.W3School;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter natural number : ");
        int number = sc.nextInt();
        System.out.print("The first n natural numbers are :");
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            System.out.print(" " + i);
            sum += i;
        }
        System.out.println();
        System.out.println("The sum of natural numbers : " + sum);


    }
}
