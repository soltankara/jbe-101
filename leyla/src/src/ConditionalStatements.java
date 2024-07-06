package src;

import java.util.Scanner;
public class ConditionalStatements {
    public static void main(String[] args) {
        //question1
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println(num+"is a positive number");
        }
        else if(num<0){
            System.out.println(num+"is negative number");
        }
        else{
            System.out.println(num+"is zero");
        }
        //question2
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        double a=sc.nextDouble();
        System.out.println("Enter b:");
        double b=sc.nextDouble();
        System.out.println("Enter c:");
        double c=sc.nextDouble();
        double result=b*b-4*a*c;
        if(result>0){
            double r1=-b+Math.sqrt(result)/(2.0*a);
            double r2=-b-Math.sqrt(result)/(2.0*a);
            System.out.println("The roots are"+r1+ "and"+r2);
        }
        else if(result==0){
            double r1=-b/(2*a);
            System.out.println("The root is"+r1);
        }
        else{
            System.out.println("There is no root");
        }
        //question3
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter c:");
        int c=sc.nextInt();
        if(a>b&& a>c){
            System.out.println(a+"is the greatest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the greatest number");
        }
        else{
            System.out.println(c+"is the greatest");
        }*/
        //question4
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the float-point value");
        double input = sc.nextDouble();
        if (input > 0) {
            if (input < 1) {
                System.out.println("Value is positive small");
            }
        } else if (input > 1000000) {
            System.out.println("Value is positive large");
        } else {
            System.out.println("Value is positive number");
        }
        else if(input<0){
            if(Math.abs(input) < 1){
                System.out.println("Value is negative small");
            }
            else if(Math.abs(input)>1000000){
                System.out.println("Value is negative large");
            }
            else{
                System.out.println("Value is negative number");
            }
        }
        else {
            System.out.println("Value is zero");
        }



    }
}
