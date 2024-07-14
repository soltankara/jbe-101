package Classworks;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int pre = 0;
        int next = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(pre + " ");
            int sumnext = next + pre;
            pre = next;
            next = sumnext;
        }
    }
}
