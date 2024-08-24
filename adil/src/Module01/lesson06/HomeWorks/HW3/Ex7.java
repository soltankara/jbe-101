package Module01.lesson06.HomeWorks.HW3;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int month = scanner.nextInt();
        System.out.print("Input a year: ");
        int year = scanner.nextInt();
        LocalDate localDate = LocalDate.of(year, month, 1);
        System.out.println(localDate.getMonth() + " " + localDate.getYear() + " has " +
                localDate.lengthOfMonth() + " days");
    }
}
