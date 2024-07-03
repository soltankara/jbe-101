import java.util.Scanner;

public class AyselScannerHw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text:");
        String text = scanner.nextLine();
        System.out.print("Enter char:");
        char symbol = scanner.next().charAt(0);
        int index= text.indexOf(symbol);
        if (index!=-1) {
            System.out.println(index);
        }

    }
}




