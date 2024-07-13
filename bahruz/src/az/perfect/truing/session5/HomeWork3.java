package az.perfect.truing.session5;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive integer:");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is a even");
            } else if (i % 2 == 1) {
                System.out.println(i + " is a odd");
            }
        }




    }
}

