package az.turing.truing.session5;

import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        while (true) {

            if (num < 0 || num > 7) {
                System.out.println("Number is incorrect!");
                num = sc.nextInt();
            }


            switch (num) {
                case 1:
                    System.out.println("Monday");
                    num=sc.nextInt();
                    break;
                case 2:
                    System.out.println("Tuesday");
                    num = sc.nextInt();
                    break;
                case 3:
                    System.out.println("Wednesday");
                    num = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Thirsday");
                    num = sc.nextInt();
                    break;
                case 5:
                    System.out.println("Friday");
                    num = sc.nextInt();
                    break;
                case 6:
                    System.out.println("Saturday");
                    num = sc.nextInt();
                    break;
                case 7:
                    System.out.println("Sunday");
                    num = sc.nextInt();
                    break;

            }
            System.out.println("Enter the 0 for Exit:");
            if (num == 0) {
                System.exit(0);
            }

        }

    }
}
