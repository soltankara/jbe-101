import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();
        System.out.println("Let the game begin!");
        Random rand = new Random();
        int a = rand.nextInt(100);
        while (true) {
            System.out.print("Guess the number between 0 and 99");
            int guess = sc.nextInt();
            if (a == guess) {
                System.out.println("Congratulations, " + name);
                break;
            }
            else if (guess < a) {
                System.out.println("Your number is too small. Please, try again.");
            }
            else {
                System.out.println("Your number is too big. Please, try again.");
            }
        }


    }
}