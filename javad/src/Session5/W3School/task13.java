package Session5.W3School;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println("-------------------------------");
        for (int i = 1; i <= number; i++) {
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (int) Math.pow(i, 3));
        }
    }
}
