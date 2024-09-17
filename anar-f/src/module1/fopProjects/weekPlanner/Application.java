package module1.fopProjects.weekPlanner;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work, cook meals";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses, watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to park, do cycling";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "visit cousins, go for a walk";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "solve leetcode problems, make a project";
        schedule[5][0] = "Friday";
        schedule[5][1] = "meet with friends, do some research";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "play video games, read some book";

        Scanner scanner = new Scanner(System.in);
        String line;
        while (true) {
            System.out.print("Please, input the day of the week: ");
            line = scanner.nextLine().toLowerCase();
            if (line.startsWith("change")) {
                String[] divisions = line.split(" ");
                String day = divisions[1];
                switch (day) {
                    case "sunday":
                        System.out.print("Please, input new tasks for Sunday: ");
                        schedule[0][1] = scanner.nextLine();  // Update the tasks
                        break;
                    case "monday":
                        System.out.print("Please, input new tasks for Monday: ");
                        schedule[1][1] = scanner.nextLine();
                        break;
                    case "tuesday":
                        System.out.print("Please, input new tasks for Tuesday: ");
                        schedule[2][1] = scanner.nextLine();
                        break;
                    case "wednesday":
                        System.out.print("Please, input new tasks for Wednesday: ");
                        schedule[3][1] = scanner.nextLine();
                        break;
                    case "thursday":
                        System.out.print("Please, input new tasks for Thursday: ");
                        schedule[4][1] = scanner.nextLine();
                        break;
                    case "friday":
                        System.out.print("Please, input new tasks for Friday: ");
                        schedule[5][1] = scanner.nextLine();
                        break;
                    case "saturday":
                        System.out.print("Please, input new tasks for Saturday: ");
                        schedule[6][1] = scanner.nextLine();
                        break;
                    default:
                        System.out.println("Sorry, I don't understand the day you entered for the 'change' command.");
                        continue;
                }
                System.out.println("Tasks updated successfully!");
                continue;
            }
            switch (line) {
                case "exit":
                    System.exit(0);
                case "sunday":
                    System.out.print("Your tasks for " + schedule[0][0] + ": " + schedule[0][1]);
                    break;
                case "monday":
                    System.out.print("Your tasks for " + schedule[1][0] + ": " + schedule[1][1]);
                    break;
                case "tuesday":
                    System.out.print("Your tasks for " + schedule[2][0] + ": " + schedule[2][1]);
                    break;
                case "wednesday":
                    System.out.print("Your tasks for " + schedule[3][0] + ": " + schedule[3][1]);
                    break;
                case "thursday":
                    System.out.print("Your tasks for " + schedule[4][0] + ": " + schedule[4][1]);
                    break;
                case "friday":
                    System.out.print("Your tasks for " + schedule[5][0] + ": " + schedule[5][1]);
                    break;
                case "saturday":
                    System.out.print("Your tasks for " + schedule[6][0] + ": " + schedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
            System.out.println();
        }
    }
}
