package az.turing.truing.homework3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a:");
        int a=sc.nextInt();
        System.out.println("Input b:");
        int b=sc.nextInt();
        System.out.println("Input c:");
        int c=sc.nextInt();

        System.out.println("The greatest number: "+Math.max(a,Math.max(b,c)));
    }
}
