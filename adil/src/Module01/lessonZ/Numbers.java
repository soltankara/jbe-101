package Module01.lessonZ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[] guessedNumbers = new int[100];
        int k = 0;
        int target = rand.nextInt(101);
        System.out.print("Please, enter your name: ");
        String name = sc.nextLine();
        System.out.println("Let the game begin!");
        outerLoop:
        while (true) {
            System.out.print("Enter your guess: ");
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    System.out.println("Invalid guess, try again.");
                    continue outerLoop;
                }
            }
            int guess = Integer.parseInt(str);
            guessedNumbers[k++] = guess;
            if (guess == target) {
                System.out.println("Congratulations, " + name);
                break;
            } else if (guess < target) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Your number is too big. Please, try again.");
            }
        }
        guessedNumbers = Arrays.copyOf(guessedNumbers, k);
        Arrays.sort(guessedNumbers);
        System.out.print("Your numbers: ");
        for (int i = guessedNumbers.length - 1; i >= 0; i--) {
            System.out.print(guessedNumbers[i] + " ");
        }
    }
}
