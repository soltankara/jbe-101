package Exercises;

import java.util.Scanner;

//7. Write a Java program to find the number of days in a month.


public class ElshanEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month number: ");
        int num = scanner.nextInt();

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        int days = 0;

        switch (num){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            //Sıçrayış ili üçün şərtlər:
            //Şərt 1: İlin 4-ə tam bölünməsidir (year % 4 == 0).
            //Şərt 2: Lakin, 100-ə tam bölünməyən il olmalıdır (year % 100 != 0) və ya 400-ə tam bölünən il olmalıdır (year % 400 == 0).
            case 2:
                if ((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) {
                    days = 29;
                    break;
                }
                else {
                    days = 28;
                    break;
                }
            default:
                System.out.println("Yanlış ay nömrəsi. Ay nömrəsi 1-12 arasında olmalıdır.");
                break;
        }
        System.out.println("gün sayı: " + days);


    }
}
