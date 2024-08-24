package module1.session4;
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter index you want to replace: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter character you want to replace with: ");
        char character = scanner.next().charAt(index);
        System.out.println(text.replace(text.charAt(index), character));

    }
}
