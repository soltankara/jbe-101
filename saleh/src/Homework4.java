import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second integer: ");
        num2 = sc.nextInt();

        System.out.print("Choose an operation (+, -, *, /, %): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 != 0)
                    System.out.println(num1 / num2);
                else
                    System.out.println("Error: Division by zero is not allowed.");
                break;
            case '%':
                if (num2 != 0)
                    System.out.println(num1 % num2);
                else
                    System.out.println("Error: Modulus by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

    }
}
