package lesson7;

import java.util.Scanner;

public class fibon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        printfibanSeri(num);
    }

    public static void printfibanSeri(int a) { //printFibanSeri
        int first = 0, c;
        int second = 1;
        System.out.println(first);
        System.out.println(second);
        for (int i = 2; i <= a; i++) {
            c = first + second;
            System.out.print(c);
            first = second;
            second = c;
        }
    }
}
