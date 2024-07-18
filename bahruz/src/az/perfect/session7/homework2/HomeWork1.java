package az.perfect.session7.homework2;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 2; i < number; i++) {
            if (isSade(i)) {
                sum = sum + i;
            }
        }

        System.out.println("sum="+sum);

    }


    public static boolean isSade(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
