import java.util.Scanner;

//HomeWork 1
public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking inputs
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the index (starts at 0): ");
        int index = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the character: ");
        char character = scanner.nextLine().charAt(0);

        //Extracting variables
        String firstHalf = text.substring(0, index);
        String secondHalf = text.substring(index + 1);

        System.out.println(firstHalf + character + secondHalf);
    }
}
