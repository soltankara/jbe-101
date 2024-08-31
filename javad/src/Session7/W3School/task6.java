package Session7.W3School;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {32, 4, 7, -1, 124, 123, -123};
        System.out.print("Enter index [0-" + (arr.length - 1) + "] : ");
        int it = 0, index, target = 0;
        do {
            if (it > 0) System.out.print("Please type available index [0-" + arr.length + "] : ");
            index = sc.nextInt();
            it++;
        } while (index < 0 || index > arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[index]) {
                target = arr[i];
            }
        }
        System.out.println("Target value : " + target);
    }
}
