package module1.fopProjects.numbers;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
    void main() {
        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");

        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int count = 0;
        int[] guessedNumbers = new int[0];
        while (true) {
            System.out.print("Enter a number: ");
            while(!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
                System.out.print("Enter a number: ");
            }
            int userNum = sc.nextInt();

            guessedNumbers = Arrays.copyOf(guessedNumbers, count + 1);
            guessedNumbers[count] = userNum;
            count++;
            Arrays.sort(guessedNumbers);
            reverse(guessedNumbers);

            if (randomNum == userNum) {
                System.out.println(STR."Congratulations, \{name}");
                System.out.print("Your module1.fopProjects.numbers : " + Arrays.toString(guessedNumbers));
                return;
            } else if (randomNum > userNum) {
                System.out.println("Your number is too small. Please, try again.");
            } else {
                System.out.println("Your number is too big. Please, try again.");
            }
        }
    }

    public void reverse(int[] array) {
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }
}
