package az.perfect.session7.homework1;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        if (isSade(1)) {
            System.out.println("Eded sadedir");
        } else {
            System.out.println("Eded sade deyil!");
        }

    }

    public static boolean isSade(int number) {

        for (int i = 2; i < number; i++) {
            if(number==0||number==1){
                System.out.println("Eded ne sade ne de murekkeb deyil!");
            }
            if (number % i == 0) {
                return false;
            }

        }

        return true;
    }


}
