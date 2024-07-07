package session6coursework;

import java.util.Random;
import java.util.Scanner;

public class CourseWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = new Random().nextInt(0, 10);
        int tries = 3;
        int guess = 0;
        System.out.println("You have 3 tries. Guess the number between 0 and 10");

        while (tries != 0) {
            System.out.println("Take a guess: ");
            guess = scanner.nextInt();
            if (guess == numberToGuess) {
                System.out.println("Correct, you won! the number was ---> " + numberToGuess);
                break;
            } else {
                tries--;
                System.out.println("Wrong guess.");

                if (tries == 0) {
                    System.out.println("You failed to guess the number.");
                    break;
                }

                if (guess > numberToGuess)
                    System.out.println("Try lower number");
                else
                    System.out.println("Try higher number");
            }
        }
        System.out.println("Number was: " + numberToGuess);
    }
}
