import java.util.Scanner;

public class ScannerHW2 {

    public static void main(String[] args){
        int result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.println("Enter char you want to see index:");
        char simvol = scanner.next().charAt(0);

        result = text.indexOf(simvol);
        System.out.print(result + 1);



    }
}
