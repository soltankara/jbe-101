package Session7.W3School;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length - 1];
        for (int container : arr) {
            System.out.print(container + " ");
        }
        System.out.println("\n--------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter specific element : ");
        int number = sc.nextInt();
        int newArrIndex = 0;

        // elemeti silib yeni arraya atır (yeni array əvvəlkindən 1 vahid daha kiçikdir)

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                continue;
            }
            newArr[newArrIndex] = arr[i];
            newArrIndex++;
        }
        System.out.println("--------------------------------------");
        System.out.print("new array -> ");
        for (int container : newArr) {
            System.out.print(container + " ");
        }


    }
}
