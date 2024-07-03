import java.util.Scanner;

public class AyselScannerHw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text:");
        String text = scanner.nextLine();
        System.out.print("Enter index:");
        int index = scanner.nextInt();
        System.out.println("Enter characther you want to replace with: ");
        char replacementChar = scanner.next().charAt(0);
        if (index >= 0 && index < text.length()) {
            StringBuilder newText = new StringBuilder(text);
            newText.setCharAt(index, replacementChar);
            System.out.println("Updated text:" + newText.toString());
        } else {
            System.out.println("Invalid index.");

        }
        scanner.close();
    }
}
