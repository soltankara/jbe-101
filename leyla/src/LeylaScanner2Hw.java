import java.util.Scanner;
public class LeylaScanner2Hw {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a text:");
        String text=scanner.nextLine();
        System.out.println("enter a char:");
        char symbol=scanner.next().charAt(0);
        int index= text.indexOf(symbol);
        System.out.println(index);
    }
}
