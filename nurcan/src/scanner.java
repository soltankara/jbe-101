import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        //Scanner homework 1
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scan.nextLine();
        System.out.print("Enter index you want to replace: ");
        int index = scan.nextInt();
        char symbol = text.charAt(index);
        System.out.print("Enter character you want to replace with: ");
        String character = scan.next();
        char character2 = character.charAt(0);
        String text2 = text.substring(0, index) + character2 + text.substring(index + 1);
        System.out.println(text2);

        //homework 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter char you want to see index: ");
        String character1 = scanner.next();
        int index1 = text1.indexOf(character1);
        System.out.printf("char is at this index: %d", index1);

    }

}

