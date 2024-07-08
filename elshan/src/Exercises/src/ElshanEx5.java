package Exercises.src;

import java.util.Scanner;

public class ElshanEx5 {
    public static void main(String[] args) {
  //      5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        switch (num){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("1-7 arasi reqem daxil edin!");
                break;
        }

    }
}
