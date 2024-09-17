package session24;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] schedule = {
                {"Sunday", "do home work"},
                {"Monday", "go to course"},
                {"Tuesday", "prepare a presentation"},
                {"Wednesday", "meet with friends"},
                {"Thursday", "write the letter"},
                {"Friday", "join the meeting"},
                {"Saturday", "go to cinema"}
        };
        while (true) {
            System.out.print("Enter day: ");
            String day = scan.nextLine().trim().toLowerCase();
            if (day.equals("exit")) break;
            switch (day) {
                case "sunday":
                    System.out.println("Your task for sunday: " + schedule[0][1]);
                    break;
                case "monday":
                    System.out.println("Your task for monday: " + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your task for tuesday: " + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your task for wednesday: " + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your task for thursday: " + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your task for friday: " + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your task for saturday: " + schedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please, try again.");
            }
        }
    }
}
