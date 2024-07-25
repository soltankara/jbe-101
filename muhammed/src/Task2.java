import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();
        System.out.print("Which character's index do u want to see? ");
        char ch = scanner.next().charAt(0);
        int index = text.indexOf(ch);
        System.out.printf("The index of the character, that u entered is %d", index);
    }
}
