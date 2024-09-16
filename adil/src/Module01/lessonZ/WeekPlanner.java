package Module01.lessonZ;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "play football; read a book";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to courses; go for a walk";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "play tennis; do homework";
        schedule[5][0] = "Friday";
        schedule[5][1] = "go to courses";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "play volleyball; read a book";
        outerLoop:
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please, input the day of the week: ");
            String command = sc.nextLine().trim();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
            String[] arr = command.split(" ");
            if (arr.length == 2 && arr[0].equalsIgnoreCase("change")) {
                String day = arr[1];
                for (String[] strings : schedule) {
                    if (strings[0].equalsIgnoreCase(day)) {
                        System.out.printf("Please, input new tasks for %s.\n", strings[0]);
                        strings[1] = sc.nextLine();
                        continue outerLoop;
                    }
                }

            }
            for (String[] strings : schedule) {
                if (strings[0].equalsIgnoreCase(command)) {
                    System.out.printf("Your tasks for %s: %s\n", strings[0], strings[1]);
                    continue outerLoop;
                }
            }
            System.out.println("Sorry, I don't understand you, please try again.");
        }

    }
}
