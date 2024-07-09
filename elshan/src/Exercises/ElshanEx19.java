package Exercises;

public class ElshanEx19 {
    public static void main(String[] args) {
        // 19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.
        for (int i = 1; i <= 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
    }
}
}
