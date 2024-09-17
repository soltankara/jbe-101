package module1Tasks;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "read a book; exercise";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to the gym; play tennis";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "practice coding; go for a walk";
        schedule[5][0] = "Friday";
        schedule[5][1] = "write a report; attend a meeting";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "clean the house; make dinner";


        while (true) {
            System.out.println("Please, input the day of the week : ");
            String weekDay = scanner.nextLine().trim().toLowerCase();

            if (weekDay.equals("exit")) {
                System.out.println("Exiting the program!");
                break;
            }
            switch (weekDay) {
                case "sunday":
                    System.out.println("Your tasks for Sunday: " + schedule[0][1]);
                    break;
                case "monday":
                    System.out.println("Your tasks for Monday: " + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.println("Your tasks for Tuesday: " + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.println("Your tasks for Wednesday: " + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.println("Your tasks for Thursday: " + schedule[4][1]);
                    break;
                case "friday":
                    System.out.println("Your tasks for Friday: " + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.println("Your tasks for Saturday: " + schedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}
