package arrays;

import java.util.Scanner;

public class EX31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int searchedNumber = scanner.nextInt();
        int sumofall = scanner.nextInt();
        int[] array = {12, 9, 6, 7, 8, 10, 29, 10, 21, 10};
        System.out.println(isEualSum(array, sumofall, searchedNumber));
    }

    public static boolean isEualSum(int[] arr, int sum, int searched) {
        int k = 0;//how many searched number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searched) k++;
        }
        if (k * searched == sum) return true;
        else return false;
    }
}
