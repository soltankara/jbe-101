import java.util.Arrays;
import java.util.Scanner;

public class ScannerHW1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text: ");
        String txt = scanner.nextLine();

        System.out.println("Enter index you want to replace: ");
        int num = scanner.nextInt();

        System.out.println("Enter the character: ");
        char character = scanner.next().charAt(0);

        System.out.println(txt.substring(0, num-1) + character + txt.substring(num));

    }

  }