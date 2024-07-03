import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        boolean equal = (num1 == num2);
        boolean notEqual = (num1 != num2);
        boolean greaterThan = (num1 > num2);
        boolean lessThan = (num1 < num2);
        boolean greaterOrEqual = (num1 >= num2);
        boolean lessOrEqual = (num1 <= num2);
        System.out.printf("%d is equal to %d: %b%n", num1, num2, equal);
        System.out.printf("%d is not equal to %d: %b%n", num1, num2, notEqual);
        System.out.printf("%d is greater than %d: %b%n", num1, num2, greaterThan);
        System.out.printf("%d is less than %d: %b%n", num1, num2, lessOrEqual);
        System.out.printf("%d is greater than or equal to %d: %b%n", num1, num2, greaterOrEqual);
        System.out.printf("%d is less than or equal to %d: %b%n", num1, num2, lessOrEqual);
    }
}
