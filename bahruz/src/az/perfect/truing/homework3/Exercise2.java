package az.perfect.truing.homework3;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A ədədini daxil edin:");
        int a=sc.nextInt();
        System.out.println("B ədədini daxil edin:");
        int b=sc.nextInt();
        System.out.println("C ədədini daxil edin:");
        int c=sc.nextInt();

        double discriminant=b*b-4*a*c;

        if(discriminant>0){
            double x1=-b+Math.sqrt(discriminant)/2*a;
            double x2=-b-Math.sqrt(discriminant)/2*a;
            System.out.println("Tənliyin kökləri :"+x1+" və "+x2);


        }else if(discriminant==0){
            double x=-b/2*a;
            System.out.println("Tənliyin yeganə kökü");
        }
        else {
            System.out.println("Tənliyin kökü yoxdur!!!" );
        }

    }
}
