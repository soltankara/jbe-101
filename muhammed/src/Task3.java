import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter first integer. ");
        int firstInteger = scanner.nextInt();
        System.out.print("Please, enter second integer. ");
        int secondInteger = scanner.nextInt();
        System.out.printf("Addition : %d%n", firstInteger + secondInteger);
        System.out.printf("Subtraction : %d%n", firstInteger - secondInteger);
        System.out.printf("Multiplication : %d%n", firstInteger * secondInteger);
        // Note : The 2 codes below will run if secondInteger is different from zero
        System.out.printf("Division : %d%n", firstInteger / secondInteger);
        System.out.printf("Modulus : %d%n", firstInteger % secondInteger);


    }
}
