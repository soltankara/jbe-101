package session8;

public class Homework1 {
    public static void main(String... args) {
        int number = 5; // the number to calculate the sum up to
        int sumUsingLoop = sumUsingLoop(number);
        System.out.println("Sum of numbers up to " + number + " using loop is " + sumUsingLoop);
        int sumUsingRecursion = sumUsingRecursion(number);
        System.out.println("Sum of numbers up to " + number + " using recursion is " + sumUsingRecursion);
    }

    private static int sumUsingLoop(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    private static int sumUsingRecursion(int number) {
        if (number == 1)
            return 1;
        else
            return number + sumUsingRecursion(number - 1);
    }

}

