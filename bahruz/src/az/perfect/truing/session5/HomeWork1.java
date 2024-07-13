package az.perfect.truing.session5;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count:");

        while (true) {

            int count = sc.nextInt();
            if (count < 0 || count > 100) {
                System.out.println("Enter the count between 0 and 100");
                count = sc.nextInt();
            }


            if (count > 84 && count <= 100) {
                System.out.println("A");
            } else if (count > 64 && count <= 85) {
                System.out.println("B");
            } else if (count > 44 && count <= 65) {
                System.out.println("C");
            } else if (count > 24 && count <= 44) {
                System.out.println("D");
            } else if (count > 0 && count <= 24) {
                System.out.println("E");
            }
            System.out.println("Enter the 0 for Exit:");
            if(count==0){
                System.exit(0);
            }

        }


    }
}