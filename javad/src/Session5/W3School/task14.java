package Session5.W3School;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println("----------------------");
        for (int i = 0; i <= number; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}
