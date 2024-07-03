import java.util.Scanner;

public class TurqutScHw2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text : ");
        String text = sc.nextLine();

        System.out.print("Enter char you want to see index : ");
        char ch = sc.next().charAt(0);

        int index = text.indexOf(ch);

        System.out.println(index);
    }
}
