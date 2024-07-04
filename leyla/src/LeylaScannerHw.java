import java.util.Scanner;

public class LeylaScannerHw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text: ");
        String text = scanner.nextLine();
        System.out.print("Please enter index you want to replace:");
        int index = scanner.nextInt();
        System.out.println("Please enter a character you want to replace with:");
        char ch = scanner.next().charAt(0);
        System.out.println(text.replace(text.charAt(index), ch));
    }
}

