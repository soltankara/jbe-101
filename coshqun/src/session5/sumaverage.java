package session5;

import java.util.Scanner;

public class sumaverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double average;

        for (int i = 1; i <= 5; i++) {
            sum += i;
            System.out.println(i);
        }
        average = sum / 5;
        System.out.println("The sum of them is " + sum);
        System.out.println("The average of them is " + average);
    }
}
