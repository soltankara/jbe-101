package Exercises.src;

import java.util.Scanner;

public class ElshanEx12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a;
        int sum = 0;
        float avarage = 0;
        a = new int[6];
        System.out.println("ededleri daxil edin: ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i <= 5; i++) {
            sum += a[i];
        }
        avarage = sum/5;
        System.out.println("Summary: " + sum );
        System.out.println("Avarage: " + avarage);
    }
}
