package Session5.W3School;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();
        System.out.println("--------------------------");
        if(a==0){
            double x = -(c/b);
            System.out.println("x = "+x);
            System.exit(0);
        }
        else{
            double D = Math.pow(b,2)-4*a*c;
            if(D>0) {
                double x1 = (-b + Math.sqrt(D))/2*a;
                double x2 = (-b - Math.sqrt(D))/2*a;
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            } else if (D==0) {
                double x = (-b + Math.sqrt(D))/2*a;
                System.out.println("x1 = "+x);
            }
            else{
                System.out.println("Roots are not real number (roots are complex number)");
            }
        }
    }
}
