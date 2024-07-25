package az.perfect.session7.homework2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        //Müəyyən aralıqda sadə ədədlərin tapılması

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the startnumber");
        int start = sc.nextInt();
        System.out.println("Enter the firstnumber");
        int end = sc.nextInt();

        for (int i = start; i < end; i++) {
            if (isSade(i)) {
                System.out.println(i + " is a price number");
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
}
