package session5;

import java.util.Scanner;

public class floatpositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input: ");
        double input = scanner.nextDouble();

        if (input > 0) {
            if (input < 1) System.out.println("Positive small number");
            else if (input > 1000000) System.out.println("Positive large number");
            else System.out.println("Positive number");
        }
        if (input<0){
            double abs=input*=-1;
            if(abs<1) System.out.println("Negative small number");
            else if(abs>1000000) System.out.println("Negative large nummber");
            else System.out.println("Negative number");
        }
    }
}
