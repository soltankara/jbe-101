package aysel.src.Sesssion24;

import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        String[][] schedule=new String[7][2];
        schedule[0][0]="Monday";
        schedule[0][1]="Go to University";
        schedule[1][0]="Tuesday";
        schedule[1][1]="Watch the movie";
        schedule[2][0]="Wednesday";
        schedule[2][1]="Read the book";
        schedule[3][0]="Thursday";
        schedule[3][1]="Go to the gym";
        schedule[4][0]="Friday";
        schedule[4][1]="Clean the house;go to shopping";
        schedule[5][0]="Saturday";
        schedule[5][1]="Walk out";
        schedule[6][0]="Sunday";
        schedule[6][1]="Meet friends";


        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Please,input the day of the week");
            String day= scanner.nextLine().trim().toLowerCase();
            if(day.trim().equalsIgnoreCase("Exit")){
                System.out.println("Exiting..");
                break;
            }

            switch (day) {
                case "monday":
                    System.out.println("Your tasks for "+schedule[0][0]+": "+schedule[0][1]);
                    break;
                case"tuesday":
                    System.out.println("Your tasks for "+schedule[1][0]+": "+schedule[1][1]);
                    break;
                case "wednesday":
                    System.out.println("Your tasks for "+schedule[2][0]+": "+schedule[2][1]);
                    break;
                case "thursday":
                    System.out.println("Your tasks for "+schedule[3][0]+": "+schedule[3][1]);
                    break;
                case "friday":
                    System.out.println("Your tasks for "+schedule[4][0]+": "+schedule[4][1]);
                    break;
                case "saturday":
                    System.out.println("Your tasks for "+schedule[5][0]+": "+schedule[5][1]);
                    break;
                case "sunday":
                    System.out.println("Your tasks for "+schedule[6][0]+": "+schedule[6][1]);
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;




            }
        }
    }}


