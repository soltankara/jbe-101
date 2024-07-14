package az.perfect.session5.loops;

import java.util.Scanner;

public class Loops2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int orginal = number;
        int ters = 0;
        int sum = 0;

        while (number > 0) {
            int qaliq = number % 10;
            ters = ters * 10 + qaliq;
            number = number / 10;
            sum += qaliq;
        }

        if (orginal == ters) {

            System.out.println(sum);

        } else {
            System.out.println("Number is not palindrome!");
        }
    }
}
