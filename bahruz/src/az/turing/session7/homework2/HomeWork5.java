package az.turing.session7.homework2;

import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {25, 63, 47, 58, 16, 74};

        System.out.println("Choose the array elements you want to delete number: ");
        int number = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (number != arr[i]) {

                System.out.print(arr[i] + " ");
            }

        }

    }
}
