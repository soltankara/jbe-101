package MethodsHomework;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MethodsClasswork2 {

    public static void main(String[] args) {
        int number = 5; // the number to calculate the sum up to
        int sumUsingLoop = sumUsingLoop(number);
        System.out.println("Sum of numbers up to " + number + " using loop is " + sumUsingLoop);
        int sumUsingRecursion = sumUsingRecursion(number);
        System.out.println("Sum of numbers up to " + number + " using recursion is " + sumUsingRecursion);
    }

    private static int sumUsingRecursion(int number) {
        if (number <= 0) {
            return 0;
        }
        else {
            return number + sumUsingRecursion(number - 1);
        }
    }

    private static int sumUsingLoop(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }


}