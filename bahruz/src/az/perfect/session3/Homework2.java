package az.perfect.session3;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        //THE EXERCISES OF THE SCANNER

        Scanner sc=new Scanner(System.in);

        //1.
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter yout city:");
        String city=sc.nextLine();
        System.out.printf("Hello,my name is %s.I am %d years old.I live in %s.",name,age,city);
        //1.2.a
        System.out.println("   ");
        String result="Hello,My name is "+name+".I am "+age+" years old."+"I live in "+city+".";
        System.out.print(result);
        System.out.println("   ");
        //1.2.b
        String result2=String.format("Hello,my name is %s.I am %d years old.I live in %s.",name,age,city);
        System.out.println(result2);
    }
}
