package Modul1_Homework.WeekPlanner1;
import java.util.Optional;
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
        Optional<Day> dayOptional = planner.findDay(dayToChange);
        dayOptional.ifPresentOrElse(day -> {
            System.out.print("pls enter new task for  " + day.getName() + " : ");
            String newTaskss = sc.nextLine();
            planner.changeTasks(dayToChange, newTaskss);
            System.out.println("tasks updated.");
        }, () -> System.out.println("invalid day pls try again."));
    }

    public void showTasks(String dayName) {
        Optional<Day> dayOptional = planner.findDay(dayName);
        dayOptional.ifPresentOrElse(day -> {
            System.out.println("your tasks for " + day.getName() + " : " + day.getTasks());
        }, () -> System.out.println("sorry l don't get it ,pls repeat again ."));
    }
}