package Session5;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
        while (!validInput) { //inputun müsbət və tam ədəd olmasını yoxlamaq üçün dövr (doğru input alana kimi dövr edir)
            try {
                System.out.print("Enter a positive integer number: ");
                number = sc.nextInt();

                if (number > 0) {
                    validInput = true; // integer və positiv input alındı, loopdan çıx
                } else {
                    System.out.println("Error: Please enter a positive integer number.");
                }

            } catch (Exception e) {
                System.out.println("Error: Please enter an integer number.");
                sc.next(); // Xətalı inputu təmizlə
            }
        }


        for (int i = 2; i < number; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
            }

        }



    }
}
