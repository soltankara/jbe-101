package src.session4;
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String anar = scanner.nextLine();

        System.out.print("Enter char you want to see index: ");
        String character = scanner.next();
        System.out.print(anar.indexOf(character));
    }
}
