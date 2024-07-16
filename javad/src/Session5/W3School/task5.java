package Session5.W3School;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day : ");
        int weekDay = sc.nextInt();
        switch (weekDay) {
            case 1 -> System.out.println("it's Monday");
            case 2 -> System.out.println("it's Tuesday");
            case 3 -> System.out.println("it's Wednesday");
            case 4 -> System.out.println("it's Thursday");
            case 5 -> System.out.println("it's Friday");
            case 6 -> System.out.println("it's Saturday");
            case 7 -> System.out.println("it's Sunday");
            default -> System.out.println("unavailable weekday!");
        }
    }
}
