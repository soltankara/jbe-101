import java.util.Scanner;

//HomeWork 1
public class Homework1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Taking inputs
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        System.out.print("Enter the index (starts at 0): ");
        int index = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the character: ");
        String character = scanner.nextLine();

        //Extracting variables
        String firstHalf = text.substring(0, index);
        String secondHalf = text.substring(index);
        String replacingCharacterInString = String.valueOf(text.charAt(index));

        System.out.println(secondHalf.replaceFirst(replacingCharacterInString, character));
    }
}
