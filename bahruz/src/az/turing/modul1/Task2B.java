package az.turing.modul1;

import java.util.Scanner;

public class Task2B {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("---------Welcome to the Week's planner----------");
        String[][] weeks = new String[7][2];
        weeks[0][0] = "Sunday";
        weeks[0][1] = "do home Work!";
        weeks[1][0] = "Monday";
        weeks[1][1] = "learning English ";
        weeks[2][0] = "Tuesday";
        weeks[2][1] = "watching film";
        weeks[3][0] = "Wednesday";
        weeks[3][1] = "work in DataStructures";
        weeks[4][0] = "Thursday";
        weeks[4][1] = "have a fun with friends";
        weeks[5][0] = "Friday";
        weeks[5][1] = "go to the fitness";
        weeks[6][0] = "Saturday";
        weeks[6][1] = "run in the morning!";

        while (true) {
            System.out.println("""
                    Choose the Menu:
                    1.See today's plan
                    2.Change plan of the day
                    3.Exit""");
            int menu = scanner.nextInt();
            scanner.nextLine();
            switch (menu) {
                case 1: {
                    System.out.println("Enter the number of  day  in week:");
                    int numberDay = scanner.nextInt();
                    while (numberDay < 0 || numberDay > 6) {
                        System.out.println("Please,Number has been between 0 and 6");
                        numberDay = scanner.nextInt();
                    }
                    System.out.println("Today is " + weeks[numberDay][0] + ".Your today's task is " + weeks[numberDay][1]);
                }
                break;
                case 2: {
                    System.out.println("Write a new task:");
                    String newtask = scanner.nextLine();
                    System.out.println("Enter the day number (0 for Sunday, 6 for Saturday)");
                    int number = scanner.nextInt();
                    while (number < 0 || number > 6) {
                        System.out.println("Invalid number,Please Enter the number between  0 and 6");
                        number = scanner.nextInt();
                    }
                    weeks[number][1] = newtask;
                    System.out.println("Task has chaned!");
                }
                break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }


    }
}
