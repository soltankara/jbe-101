package NumberGuessGame;

import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (Math.random() * 10);

        System.out.println("You have to guess number between 1 and 10");
        int k = 5;
        for (int i = 0; i < k; i++) {
            int a = sc.nextInt();
            if (a == number) {
                System.out.println("Congratulations you guessed the number");
                break;
            } else if (a > number && i != k - 1) {
                System.out.println("Your guess is high!");
            } else if (a < number && i != k - 1) {
                System.out.println("Your guess is low!");
            }
            if (i == k) {
                System.out.println("You reached the limit of tries");
                System.out.println("The number was" + number);
            }
        }

    }
}
