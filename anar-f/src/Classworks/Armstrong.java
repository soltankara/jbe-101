package Classworks;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int firstDigit;
        int temp = num;
        int sum = 0;
        while (num > 0) {
            firstDigit = num % 10;
            num = num / 10;
            sum += Math.pow(firstDigit, 3);
        }
        if (sum == temp) System.out.print(sum + " is a Armstrong number");
        else System.out.println("armstrong doyul");
    }
}
