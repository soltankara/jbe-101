package module1Tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Let the game begin!");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        int secretNumber = random.nextInt(101);
        int[] guesses = new int[100];
        int attempts = 0;

        while (true) {
            System.out.print("Guess a number between 0 and 100: ");
            int userGuess = scanner.nextInt();

            guesses[attempts] = userGuess;
            attempts++;

            if (userGuess == secretNumber) {
                System.out.println("Congratulations, " + name + "!");
                break;
            } else if (userGuess < secretNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Your number is too big. Please, try again.");
            }
        }

        int[] finalGuesses = Arrays.copyOf(guesses, attempts);
        Arrays.sort(finalGuesses);

        System.out.print("Your numbers: ");
        for (int i = finalGuesses.length - 1; i >= 0; i--) {
            System.out.print(finalGuesses[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}

