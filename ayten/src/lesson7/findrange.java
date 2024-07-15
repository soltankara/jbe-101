package lesson7;

import java.util.Random;
import java.util.Scanner;

public class findrange {
    public static void main(String[] args) {
        numberbetweenRange(0, 10);
    }

    public static void numberbetweenRange(int a, int b) {
        int random = new Random().nextInt(b - a + 1) + a;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            if (num == random) {
                System.out.println("great");
                return;
            }
            if (i != 2) {
                if (num > random) System.out.println("decrease number");
                else System.out.println("increase number");
            }
        }
        System.out.println("kanka bulamadin");
        System.out.println("number was" + random);
    }
}

