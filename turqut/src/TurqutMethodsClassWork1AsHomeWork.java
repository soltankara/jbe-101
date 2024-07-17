package turqut.src;

public class TurqutMethodsClassWork1AsHomeWork {
    public static void main(String[] args) {
        int number = 5;
        int sumUsingLoop = sumWithLoop(number);
        System.out.println("Sum of numbers up to " + number + " using loop is " + sumWithLoop(number));
        int sumUsingRecursion = sumWithRecursion(number);
        System.out.println("Sum of numbers up to " + number + " using recursion is " + sumWithRecursion(number));

    }

    public static int sumWithLoop(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumWithRecursion(int number) {
        if (number == 2) {
            return 1;
        } else {
            return number - 1 + sumWithRecursion(number - 1);
        }
    }
}