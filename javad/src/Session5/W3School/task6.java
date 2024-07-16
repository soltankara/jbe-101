package Session5.W3School;

import java.util.Scanner;

public class task6 {

    // Birinci  üsul

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        int num1Int = (int) num1;
        int num2Int = (int) num2;
        int num1Decimal = (int) ((num1 - num1Int) * 1000);
        int num2Decimal = (int) ((num2 - num2Int) * 1000);
        if (num1Decimal == num2Decimal) System.out.println(" They are same");
        else System.out.println(" They are not same");
        foo();
    }

    // İkinci üsulu metod daxilində yazıram

    public static void foo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number : ");
        double num2 = sc.nextDouble();
        num1 = (int) Math.round(num1 * 100);
        num2 = (int) Math.round(num2 * 100);
        if (num1 == num2) System.out.println(" They are same");
        else System.out.println(" They are not same");
    }


}
