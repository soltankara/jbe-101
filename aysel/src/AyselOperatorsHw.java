import java.util.Scanner;

public class AyselOperatorsHw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number1:");
        int number1 = scan.nextInt();
        System.out.print("Enter a number2:");
        int number2 = scan.nextInt();
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        // printf ile
        System.out.printf("Sum: %d + %d = %d\n", number1, number2, sum);
        System.out.printf("Difference: %d - %d = %d\n", number1, number2, difference);
        System.out.printf("Product: %d * %d = %d\n", number1, number2, product);
        System.out.printf("Quotient: %d / %d = %d\n", number1, number2, quotient);
        System.out.printf("Remainder: %d %% %d = %d\n", number1, number2, remainder);
        //Compare
        System.out.printf( "Are the numbers equal? %b\n",number1 == number2);
        System.out.printf("Are the numbers not equal? %b\n", number1 != number2);
        System.out.printf("Is the first number greater than the second? %b\n", number1 > number2);
        System.out.printf("Is the first number less than the second? %b\n", number1 < number2);
        System.out.printf("Is the first number greater than or equal to the second? %b\n", number1 >= number2);
        System.out.printf("Is the first number less than or equal to the second? %b\n", number1 <= number2);

    }
}
