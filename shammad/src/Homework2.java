import java.util.Scanner;

//HomeWork 2
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking inputs
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the character to see its index: ");
        String character = scanner.nextLine();

        System.out.println(text.indexOf(character));
    }
}
