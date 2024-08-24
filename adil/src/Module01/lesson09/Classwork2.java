package Module01.lesson09;

public class Classwork2 {
    public static void main(String[] args) {
        int number = 5; // the number to calculate the sum up to
        int sumUsingLoop = sumUsingLoop(number);
        System.out.println("Sum of numbers up to " + number + " using loop is " + sumUsingLoop);
        int sumUsingRecursion = sumUsingRecursion(number);
        System.out.println("Sum of numbers up to " + number + " using recursion is " + sumUsingRecursion);
    }

    public static int sumUsingRecursion(int number) {
        // todo: write your code here
        return number == 0 ? 0 : number + sumUsingRecursion(number - 1);
    }

    public static int sumUsingLoop(int number) {
        // todo: write your code here
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

}
