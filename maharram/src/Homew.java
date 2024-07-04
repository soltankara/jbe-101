
//Scanner 2

import java.util.Scanner;

public class Homew {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter your text :");

        String text = scanner.nextLine();

        System.out.print("enter symbol which you want to see index : ");

        String symbol = scanner.nextLine();

        System.out.println(" your symbol index is :" + text.indexOf(symbol));

    }


}
