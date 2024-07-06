package session5;

import java.util.Scanner;

public class equal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        double fpn1 = scanner.nextDouble();

        System.out.print("Input floating-point another number: ");
        double fpn2 = scanner.nextDouble();

        if(fpn1==fpn2) System.out.println("The are the same numbers");
        else System.out.println("They are the different numbers");
    }
}
