package lesson06.HomeWorks.HW3;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the 5 numbers: ");
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum of 5 no is: " + sum);
        System.out.println("The Average is: " + (double) sum / 5);
    }
}
