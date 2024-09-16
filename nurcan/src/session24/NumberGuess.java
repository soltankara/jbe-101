package session24;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.next();
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Let the game begin!");
        int[] array = new int[0];
        int k = 0;
        while (true) {
            System.out.print("Enter number: ");
            int enterNumber = scan.nextInt();
            array = Arrays.copyOf(array, k + 1);
            array[k++] = enterNumber;
            if (enterNumber < number) {
                System.out.println("Your number is too small. Please. try again...");
            } else if (enterNumber > number) {
                System.out.println("Your number is too big. Please, try again...");
            } else {
                Arrays.sort(array);
                System.out.print("Your numbers: ");
                for (int i : array) {
                    System.out.print(i + " ");
                }
                System.out.printf("\nCongratulations, %s!", name);
                break;
            }
        }
    }
}

