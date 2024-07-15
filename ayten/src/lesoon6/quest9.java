package lesoon6;

import java.util.Scanner;

public class quest9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean isleap;
        if ((year % 4 != 0 || year % 400 != 0) && year % 100 == 0) isleap = false;
        else isleap = true;
        if (isleap) System.out.println("leap");
        else System.out.println("is'nt leap");
    }
}
