import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();

        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println("Let the game begin!");

        while (true) {
            System.out.print("Enter a number: ");
            int enterNumber = scanner.nextInt();
            if (enterNumber < num) {
                System.out.println("Your number is too small. Please. try again...");
            } else if (enterNumber > num) {
                System.out.println("Your number is too big. Please, try again...");
            } else {
                System.out.printf("\nCongratulations, %s!", name);
                break;
                }

            }
        }
    }
