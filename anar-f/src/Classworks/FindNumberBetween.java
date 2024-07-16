package Classworks;

import java.util.Random;
import java.util.Scanner;

public class FindNumberBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the second number: ");
        int end = sc.nextInt();

        boolean flag = false;
        int randomNum = new Random().nextInt(end - start + 1) + start;
        for (int i = 0; i < 3; i++) {
            System.out.print(randomNum + " ");
            if (randomNum >= start && randomNum <= end) {
                flag = true;
            }
        }
        if (flag) System.out.print("tapdun");
        else System.out.print("yok");
    }
}
