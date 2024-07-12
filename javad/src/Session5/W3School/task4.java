package Session5.W3School;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        if (number < 0) {
            System.out.println(number + " is negative");
        } else if (number == 0) {
            System.out.println(number + " is zero");
        } else {
            if (number < 1) {
                System.out.println(number + " is small positive");
            }
            else if (number > 1_000_000) {
                System.out.println(number + " is large positive");
            } else {
                System.out.println(number + " is positive");
            }
        }
    }
}
