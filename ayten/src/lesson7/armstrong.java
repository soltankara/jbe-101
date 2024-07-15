package lesson7;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int a) {
        int b = a, sum = 0;
        while (a > 0) {
            sum += (int) Math.pow(a % 10, 3);
            a /= 10;
        }
        return b == sum;
    }
}
