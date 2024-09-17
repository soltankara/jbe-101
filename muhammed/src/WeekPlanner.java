import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Monday";
        schedule[0][1] = "do homework";
        schedule[1][0] = "Tuesday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Wednesday";
        schedule[2][1] = "go to cinema for watching the best film (Godfather)";
        schedule[3][0] = "Thursday";
        schedule[3][1] = "go to El Clasico";
        schedule[4][0] = "Friday";
        schedule[4][1] = "go to the gym";
        schedule[5][0] = "Saturday";
        schedule[5][1] = "go to the karting";
        schedule[6][0] = "Sunday";
        schedule[6][1] = "sleep at home";

        while (true) {
            System.out.println("Input the day of week or if want to exit write exit.");
            Scanner scanner = new Scanner(System.in);
            String day = scanner.nextLine().toLowerCase();

            if (day.equals("exit")) {
                break;
            }
            switch (day) {
                case "monday":
                    System.out.println("Your task for monday: " + schedule[0][1]);
                    break;
                case "tuesday":
                    System.out.println("Your task for tuesday: " + schedule[1][1]);
                    break;
                case "wednesday":
                    System.out.println("Your task for wednesday: " + schedule[2][1]);
                    break;
                case "thursday":
                    System.out.println("Your task for thursday: " + schedule[3][1]);
                    break;
                case "friday":
                    System.out.println("Your task for friday: " + schedule[4][1]);
                    break;
                case "saturday":
                    System.out.println("Your task for saturday: " + schedule[5][1]);
                    break;
                case "sunday":
                    System.out.println("Your task for sunday: " + schedule[6][1]);
                    break;
                default:
                    System.out.println("Please enter name of week correctly.");
            }

        }

    }
}
