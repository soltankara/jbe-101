import java.util.Scanner;

public class OperatorsHW {

    public static void main(String[] args) {

        float sub,add,multi,divison,modul;

        Scanner scanner = new Scanner(System.in);
        System.out.print("x1 = ");
        float x1 = scanner.nextFloat();

        System.out.print("x2 = ");
        float x2 = scanner.nextFloat();

        add = x1 + x2;
        sub = x1 - x2;
        multi = x1 * x2;
        divison = x1/x2;
        modul = x1 % x2;

        System.out.printf(" addition: %f", add);
        System.out.printf(" subtraction: %f", sub);
        System.out.printf(" multiplication: %f", multi);
        System.out.printf(" divison: %f", divison);
        System.out.println(" modulus: " + modul);

        System.out.print("x3 = ");
        int x3 = scanner.nextInt();

        System.out.print("x4 = ");
        int x4 = scanner.nextInt();

        System.out.println(x3 + " " + x4 + " " + "ededine beraberdir: " + (x3 == x4) );
        System.out.println(x3 + " " + x4 + " " + "ededine beraber deyil: " + (x3 != x4) );
        System.out.println(x3 + " " + x4 + " " + "ededine boyuk beraberdir: " + (x3 >= x4) );
        System.out.println(x3 + " " + x4 + " " + "ededine kicik beraberdir: " + (x3 <= x4) );
        System.out.println(x3 + " " + x4 + " " + "ededineden boyukdur: " + (x3 > x4) );
        System.out.println(x3 + " " + x4 + " " + "ededineden kicikdir: " + (x3 < x4) );
    }
}
