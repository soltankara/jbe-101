package Session24;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Monday";
        schedule[0][1] = "Go to university";
        schedule[1][0] = "Tuesday";
        schedule[1][1] = "Do your homework";
        schedule[2][0] = "Wednesday";
        schedule[2][1] = "Go to cinema and have fun";
        schedule[3][0] = "Thursday";
        schedule[3][1] = "Clean your room";
        schedule[4][0] = "Friday";
        schedule[4][1] = "Hang out your friends";
        schedule[5][0] = "Saturday";
        schedule[5][1] = "Do shopping";
        schedule[6][0] = "Sunday";
        schedule[6][1] = "Have a rest";
        for (int i = 0; i < schedule.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, input the day of the week: ");
            String input = sc.nextLine().trim().toLowerCase();
            if (input.trim().equalsIgnoreCase("EXIT")) {
                break;
            }
            switch (input) {
                case "monday":
                    System.out.println("Your tasks for Monday:Go to university");
                    break;
                case "tuesday":
                    System.out.println("Your tasks for Tuesday:Do your homework");
                    break;
                case "wednesday":
                    System.out.println("Your tasks for Wednesday:Go to cinema and have fun");
                    break;
                case "thursday":
                    System.out.println("Your tasks for Thursday:Clean your room");
                    break;
                case "friday":
                    System.out.println("Your tasks for Friday:Hang out your friends");
                    break;
                case "saturday":
                    System.out.println("Your tasks for Saturday:Do shopping");
                    break;
                case "sunday":
                    System.out.println("Your tasks for Sunday:Have a rest");
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
