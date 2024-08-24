package Module01.lesson08.ClassWorks;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Enter first index: ");
        int first = scanner.nextInt();
        System.out.print("Enter second index: ");
        int second = scanner.nextInt();
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
