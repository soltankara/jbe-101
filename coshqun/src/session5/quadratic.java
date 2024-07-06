package session5;

import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = scanner.nextDouble();
        System.out.print("Input b: ");
        double b = scanner.nextDouble();
        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        double discrim = b * b - 4 * a * c;
        if(discrim>0){
            double root1 = (-b - Math.sqrt(discrim)) / (2*a);
            double root2 = (-b + Math.sqrt(discrim)) / (2*a);
            System.out.println("The roots are " + root1 + " and " + root2);
        }
        else if(discrim==0) {
            double root = -b/2;
            System.out.println("The root is "+ root);
        }
        else System.out.println("There isn't a root");
    }
}
