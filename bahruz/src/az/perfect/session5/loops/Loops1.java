package az.perfect.session5.loops;

import java.util.Scanner;

public class Loops1 {

    public static void main(String[] args) {



        //Fibonnaci

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0; i < number; i++) {
            int c=a;
            a=b;
            b=b+c;
            System.out.print(b+" ");
        }
    }
}
