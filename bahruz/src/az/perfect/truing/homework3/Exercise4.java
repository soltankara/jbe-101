package az.perfect.truing.homework3;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a:");
        double a=sc.nextInt();
        System.out.println("Input b: ");
        double b=sc.nextInt();

        a=Math.round(a*1000);
        b=Math.round(b*1000);

        if(a==b){
            System.out.println("They are same.");
        }else {
            System.out.println("They are different. ");
        }
        System.out.println(a);
    }
}
