import java.util.Scanner;

public class Lesson5task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //TaskNumber 1
        System.out.print("Input number : ");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("Number is positive");
        } else if (num1 < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        //TaskNumber 2
        System.out.print("Input a : ");
        double a = sc.nextDouble();
        System.out.print("Input b : ");
        double b = sc.nextDouble();
        System.out.print("Input c : ");
        double c = sc.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + x1 + " and " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Two equal roots is : " + x);
        } else {
            System.out.println("No real roots");
        }

        //TaskNumber 3
        System.out.print("Input the 1st number : ");
        int first = sc.nextInt();
        System.out.print("Input the 2nd number : ");
        int second = sc.nextInt();
        System.out.print("Input the 3rd number : ");
        int third = sc.nextInt();

        if (first > second && first > third) {
            System.out.println("The greatest: " + first);
        }
        if (second > first && second > third) {
            System.out.println("The greatest: " + second);
        }
        if (third > first && third > second) {
            System.out.println("The greatest: " + third);
        }

        //TaskNumber 4
        System.out.print("Input a number : ");
        double number = sc.nextDouble();
        if (number == 0) {
            System.out.println("zero");
        } else if (number > 0) {
            if (number < 1) {
                System.out.println("Positive small number");
            } else if (number > 1000000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }
        } else {
            if (number > -1) {
                System.out.println("Negative small number");
            } else if (number < -1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }
        }

        //TaskNumber 5
        System.out.print("Input number : ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;
        }

        //TaskNumber 6
        System.out.print("Input floating-point number : ");
        double n1 = sc.nextDouble();
        System.out.print("Input floating-point another number : ");
        double n2 = sc.nextDouble();
        n1 = Math.round(n1 * 1000);
        n1 /= 1000;
        n2 = Math.round(n2 * 1000);
        n2 /= 1000;

        if (n1 == n2) {
            System.out.println("They are same");
        } else {
            System.out.println("They are different");
        }

        //TaskNumber 7
        System.out.print("Input a month number : ");
        int monthNumber = sc.nextInt();
        String monthName = "";
        System.out.print("Input a year : ");
        int year = sc.nextInt();

        switch (monthNumber) {
            case 1:
                monthName = "January";
                monthNumber = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    monthNumber = 29;
                } else {
                    monthNumber = 28;
                }
                break;
            case 3:
                monthName = "March";
                monthNumber = 31;
                break;
            case 4:
                monthName = "April";
                monthNumber = 30;
                break;
            case 5:
                monthName = "May";
                monthNumber = 31;
                break;
            case 6:
                monthName = "June";
                monthNumber = 30;
                break;
            case 7:
                monthName = "July";
                monthNumber = 31;
                break;
            case 8:
                monthName = "August";
                monthNumber = 31;
                break;
            case 9:
                monthName = "September";
                monthNumber = 30;
                break;
            case 10:
                monthName = "October";
                monthNumber = 31;
                break;
            case 11:
                monthName = "November";
                monthNumber = 30;
                break;
            case 12:
                monthName = "December";
                monthNumber = 31;
                break;
            default:
                System.out.println("Invalid month number");
        }

        System.out.println(monthName + " " + year + " year has " + monthNumber + " days");

        //TaskNumber 8 (most challenging one for me)
        System.out.print("Input an alphabet : ");
        String alphabet = sc.nextLine();

        boolean uppercase = alphabet.charAt(0) >= 65 && alphabet.charAt(0) <= 90;
        boolean lowercase = alphabet.charAt(0) >= 97 && alphabet.charAt(0) <= 122;
        boolean vowels = alphabet.equals("a") || alphabet.equals("A") || alphabet.equals("e") || alphabet.equals("E") || alphabet.equals("i") || alphabet.equals("I") || alphabet.equals("o") || alphabet.equals("O") || alphabet.equals("u") || alphabet.equals("U");
        if (!(uppercase || lowercase) || alphabet.length() > 1) {
            System.out.println("Error");
        } else {
            if (vowels) {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        }

        //TaskNumber 9
        System.out.print("Input the year : ");
        int y = sc.nextInt();

        if (y % 4 == 0) {
            if (y % 100 == 0) {
                if (y % 400 == 0) {
                    System.out.println(y + " is a leap year");
                } else {
                    System.out.println(y + " is not a leap year");
                }
            } else {
                System.out.println(y + " is a leap year");
            }
        } else {
            System.out.println(y + " is not a leap year");
        }

        //TaskNumber 10
        System.out.println("The first 10 natural numbers are : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //TaskNumber 11
        System.out.println("Input the number : ");
        int sum = 0;
        int d = sc.nextInt();

        System.out.print("The first n natural numbers are : " + d);
        System.out.println();
        for (int i = 1; i <= d; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The Sum of Natural Number upto n terms : " + sum);

        //TaskNumber 12
        System.out.println("Input the 5 numbers : ");
        int summarize = 0;
        double average;
        for (int i = 0; i < 5; i++) {
            int e = sc.nextInt();
            summarize += e;
        }

        average = (double) summarize / 5;

        System.out.println("The sum of 5 no is : " + summarize);
        System.out.println("The Average is : " + average);

        //TaskNumber13
        System.out.print("Input number of terms : ");
        int terms = sc.nextInt();

        for (int i = 1; i <= terms; i++) {
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (int) Math.pow(i, 3));
        }

        //TaskNumber14
        System.out.print("Input the number(Table to be calculated): ");
        System.out.print("Input number of terms : ");
        int t = sc.nextInt();

        for (int i = 0; i <= t; i++) {
            System.out.println(t + " X " + i + " = " + i * t);
        }

        //TaskNumber15
        int summary = 0;
        System.out.print("Input number of terms is : ");
        int f = sc.nextInt();
        System.out.println("The odd numbers are : ");
        for (int i = 1; i < f * 2; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                summary += i;
            }
        }
        System.out.println("The Sum of odd Natural Number upto 5 terms is : " + summary);

        //TaskNumber16
        System.out.print("Input number of rows : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        //TaskNumber 17
        System.out.print("Input number of rows : ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        //TaskNumber 18
        int o = 1;
        System.out.print("Input number of rows : ");
        int w = sc.nextInt();
        for (int i = 1; i <= w; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(o++ + " ");
            }
            System.out.println();
        }


        //TaskNumber 19
        System.out.print("Input number of rows : ");
        int numberOfRows = sc.nextInt();
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= numberOfRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        //TaskNumber 20
        /*Solution of this task is the absolutely same the solution of TaskNumber 18. Please check that solution. */
    }
}
