package az.turing.truing.session5;

import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive Integer: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {

            if (isSade(i)) {
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static boolean isSade(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
