import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Fist
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.print("Which index do u want to replace? ");
        int index = scanner.nextInt();
        System.out.print("Which character do u want to replace with? ");
        char ch = scanner.next().charAt(0);
        StringBuilder new_text = new StringBuilder(text);
        new_text.setCharAt(index,ch);
        System.out.println(new_text);
    }
}