package lesoon6;

import java.util.Scanner;

public class Quest6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        int chang1 = (int) num1 * 1000;
        int change2 = (int) num2 * 1000;
        if (chang1 == change2) System.out.println("They are same");
        else System.out.println("They are different");
    }

}


