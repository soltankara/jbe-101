package Modul1_Homework.WeekPlanner1;
import java.util.Scanner;
public class TaskManager {
    private WeekPlanner planner;
    private Scanner sc;

    public TaskManager() {
        planner = new WeekPlanner();
        sc = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.print("please input the day of the week(or exit to quit):");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("the program has ended ");
                break;
            } else if (input.startsWith("change")) {
                handleTaskChange(input);
            } else {
                showTasks(input);
            }
        }
    }

    private void handleTaskChange(String input) {
        String dayToChange = input.substring(input.indexOf(' ') + 1).trim();
        Day day = planner.findDay(dayToChange);
        if (day != null) {
            System.out.print("pls enter new task for  " + capitalize(day.getName()) + " : ");
            String newTaskss = sc.nextLine();
            planner.changeTasks(dayToChange, newTaskss);
            System.out.println("tasks updated.");
        } else {
            System.out.println("invalid day pls try again.");
        }

    }

    public void showTasks(String dayName) {
        Day day = planner.findDay(dayName);
        if (day != null) {
            System.out.println("your tasks for " + capitalize(day.getName()) + " : " + day.getTasks());
        } else {
            System.out.println("sorry l don't get it ,pls repeat again .");
        }
    }

    private String capitalize(String word) {
        if (word != null || word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
