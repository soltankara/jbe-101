package session5;

import java.util.Scanner;

public class Homew2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.print("There is no prime number less than and equal to the number  ");
        } else {
            System.out.print("prime numbers less than or equal to : ");
            for (int i = 0; i <= number; i++) {
                if (primenumber(i)) {
                    System.out.print(i + "  ");

                }


            }

        }

    }


    public static boolean primenumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;


    }


}
