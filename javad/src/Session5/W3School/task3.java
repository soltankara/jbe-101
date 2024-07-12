package Session5.W3School;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("first number : ");
        double num1 = sc.nextDouble();
        System.out.print("second number : ");
        double num2 = sc.nextDouble();
        System.out.print("third number : ");
        double num3 = sc.nextDouble();
        if (!(num1 == num2 && num2 == num3)) {
            if (num1 > num2 && num1 > num3) {
                System.out.println("The greatest number is " + num1);
            } else if (num2 > num1 && num2 > num3) {
                System.out.println("The greatest number is " + num2);
            } else {
                System.out.println("The greatest number is " + num3);
            }
        } else System.out.println("All numbers are equal");
    }
}
