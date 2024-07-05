package lesson5;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //Used a logic where if number's modulus till its square root does not equals 0, it is prime
        //Square root is used for performance. it does not matter using modulus after its square root integer number.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
        if (number <= 0)
            System.out.println("Please enter a valid, positive number.");
        else if (number == 1)
            System.out.println("No prime numbers.");
        else {
            //this for loop is for checking numbers till the input number.
            for (int i = 2; i <= number; i++) {
                boolean isPrime = true;
                int temp = (int) Math.sqrt((double) i);

                //this loop checks if the number is prime or not
                for (int j = 2; j <= temp; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime)
                    System.out.print(i + " ");
            }
        }
    }
}
