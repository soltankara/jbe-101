package Session24;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Let the game begin!");

        int randomNumber = random.nextInt(101);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        int[] userGuesses = new int[100];
        int guessCount = 0;

        while (true) {
            System.out.println("Enter your guess: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input,pls enter a number:");
                sc.next();
            }

            int userGuess = sc.nextInt();

            if (guessCount < userGuesses.length) {
                userGuesses[guessCount++] = userGuess;
            }
            if (userGuess < randomNumber) {
                System.out.println("Your number is too small,pls try again");
            } else if (userGuess > randomNumber) {
                System.out.println("Your number is too big,pls try again");
            } else {
                System.out.println("Congratulations " + name);
                break;
            }
        }
        System.out.print("Your numbers: ");
        int[] validNumbers = Arrays.copyOf(userGuesses, guessCount);
        for (int i = validNumbers.length - 1; i >= 0; i--) {
            System.out.print(validNumbers[i] + " ");
        }
    }
}
