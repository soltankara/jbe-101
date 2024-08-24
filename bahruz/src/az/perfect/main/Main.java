package az.perfect.main;

import com.sun.security.jgss.GSSUtil;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int x = 5;

    public static void main(String[] args) {

        Main main1 = new Main();
        main1.x = 10;
        System.out.println(main1.x);
        System.out.println(Main.x);


    }


}

////        System.out.println(sumOfRecursive(10));
////
////
////
////    }
////    public static int sumOfRecursive(int number) {
////        int sum = 0;
////        if (number > 0) {
////            sum = number + sumOfRecursive(number - 1);
////        }
////
////        return sum;
////    }
//}
//     /*
//     7. Bir ayda günlərin sayını tapmaq üçün Java proqramı yazın.
//      Test Məlumatının
//      Girişi Ay sayı: 2
//      İldə Giriş: 2016
//      Gözlənilən Nəticə :
//      Fevral 2016 29 gündür
//      */
//        Scanner sc = new Scanner(System.in);
//        String monthName = "Unknown";
//        int countDayOfMonth = 0;
//        System.out.println("Ayin nomresini daxil edin:");
//        int number = sc.nextInt();
//        System.out.println("Ili daxil edin:");
//        int year = sc.nextInt();
//        findMOnth(number,monthName,countDayOfMonth,year);
//
//
//    }
//
//    public static void findMOnth(int number, String monthName, int countDayOfMonth, int year) {
//
//        switch (number) {
//            case 1:
//                monthName = "Yanvar";
//                countDayOfMonth = 31;
//                break;
//            case 2:
//                monthName = "Fevral";
//                if (year % 4 == 0) {
//                    countDayOfMonth = 29;
//                } else {
//                    countDayOfMonth = 28;
//
//                }
//                break;
//            case 3:
//                monthName = "Mart";
//                countDayOfMonth = 31;
//                break;
//            case 4:
//                monthName = "Aprel";
//                countDayOfMonth = 30;
//                break;
//            case 5:
//                monthName = "May";
//                countDayOfMonth = 31;
//                break;
//            case 6:
//                monthName = "Iyun";
//                countDayOfMonth = 30;
//                break;
//            case 7:
//                monthName = "Iyul";
//                countDayOfMonth = 31;
//                break;
//            case 8:
//                monthName = "Avqust";
//                countDayOfMonth = 31;
//                break;
//            case 9:
//                monthName = "Sentyabr";
//                countDayOfMonth = 30;
//                break;
//            case 10:
//                monthName = "Oktyabr";
//                countDayOfMonth = 31;
//                break;
//            case 11:
//                monthName = "Noyabr";
//                countDayOfMonth = 30;
//                break;
//            case 12:
//                monthName = "Dekabr";
//                countDayOfMonth = 31;
//                break;
//            default:
//                System.out.println("Invalid input");
//        }
//
//        System.out.println(year + "ci ilin " + monthName + " ayinda " + countDayOfMonth + " gun var");
//    }
//}


//    Scanner sc = new Scanner(System.in);
//        System.out.println("Input  A:");
//                int a = sc.nextInt();
//                System.out.println("Input  B:");
//                int b = sc.nextInt();
//                System.out.println("Input  C:");
//                int c = sc.nextInt();
//
//                double disc = b * b - 4 * a * c;
//
//                if(disc>0){
//                double x1=(-b+Math.sqrt(disc))/2*a;
//                double x2=(-b-Math.sqrt(disc))/2*a;
//                System.out.println("Tenliyin kokleri: "+x1+" "+x2);
//                }else if(disc==0){
//                double x=-b/2*a;
//                System.out.println("Tenliyin yegane koku: "+x);
//                }else{
//                System.out.println("Tenliyin koku yoxdur");
//                }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input the number:");
//        int number = sc.nextInt();
//
//        if (number == 0) {
//            System.out.println("Number is zero");
//        } else if (isnumber(number)) {
//            System.out.println("Number is positivie");
//        } else {
//            System.out.println("Number is negativ");
//        }
//
//
//    }
//
//    public static boolean isnumber(int number) {
//        if (number > 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//}

//    public static boolean isSade(int number) {
//        if (number < 2) {
//            return false;
//        }
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int num=sc.nextInt();
//
//
//        for (int i = 0; i <=num; i++) {
//
//            System.out.println(i+"is a "+(i%2==0? "even":"odd"));
//
//
//            }
//            System.out.println(i);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int number = sc.nextInt();
//        sc.nextLine();
//        if (number > 7 & number < 1) {
//            System.out.println("Please,Enter the corect number!!!");
//        }
//
//        switch (number) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thirsday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//            case 7:
//                System.out.println("Sonday");
//                break;
//            default:
//                System.out.println("Please,Enter the corect number!!!");






