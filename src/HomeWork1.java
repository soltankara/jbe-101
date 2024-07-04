package src;
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String name = scanner.nextLine();

        System.out.print("Enter index you want to replace: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter character you want to replace with: ");
        String city = scanner.nextLine();
    }
}
