import java.util.Scanner;

public class ElshanS5HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reverse = "";

        System.out.println("Enter a text: ");
        String text = scanner.nextLine();
        text = text.toLowerCase();

        for (int i = text.length() - 1 ; i >= 0 ; i--){
            reverse = reverse + text.charAt(i);
        }
        if (text.equals(reverse)){
            System.out.println(text + " is palindorme");
        }
        else {
            System.out.println(text + " is not palindrome");
        }


    }
}
