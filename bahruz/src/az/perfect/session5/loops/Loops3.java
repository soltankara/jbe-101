package az.perfect.session5.loops;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {


        //Müəyyən aralıqda sadə ədədlərintapılması

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the startnumber");
        int start = sc.nextInt();
        System.out.println("Enter the firstnumber");
        int end = sc.nextInt();

        for (int i = start; i < end; i++) {
            if (isSade(i)) {
                System.out.println(i + " is a price number");
            } else {
                System.out.println("no no no");
            }
        }


    }

    public static boolean isSade(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static String veekday(int number) {

        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else {
            return "Numberi duzgun daxil et";
        }
    }
}

