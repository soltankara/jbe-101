package session5;

import java.util.Scanner;

public class HomeWorkW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Task2-Kvadrat tenliyin koklerinin tapilmasi

        /*System.out.println("Enter the coefficients of the quadratic equation (ax^2 + bx + c = 0):");
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            // discriminant < 0
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }}
/*


        // Task3-Daxil edilen ededlerden en boyuyunun tapilmasi
       /*System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();
        System.out.print("Number 3: ");
        double num3 = scanner.nextDouble();
        double largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}

        */
        //Task10-1-den n-e qeder ededlerin ekrana cixarilmasi
        /*System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        scanner.close();

         */
        //Task11-
        /*System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        // Variables to store sum and count of terms
        int sum = 0;

        // Displaying n terms and calculating their sum
        System.out.println("First " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            sum += i;
        }

        // Displaying the sum of n terms
        System.out.println("\nSum of first " + n + " natural numbers is: " + sum);

        scanner.close();

         */
        //Task12-Daxil edilen 5 ededin cemi ve ortalamasi
       /* System.out.println("Enter 5 numbers:");
        int sum = 0;
        double average;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum += number;
        }
        average = (double) sum / 5;
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        */
        //Task13-daxil edilen edede qder butun edeleri kuba yukseltmek
        System.out.print("Enter an integer to calculate cubes up to: ");
        int n = scanner.nextInt();
        System.out.println("Cubes of numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println("Cube of " + i + " = " + cube);
        }

        scanner.close();
    }
    }

