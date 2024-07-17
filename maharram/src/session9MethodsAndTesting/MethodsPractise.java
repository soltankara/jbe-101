package session9MethodsAndTesting;
public class MethodsPractise {
    public static void main(String[] args) {
    }
    public static int sumUsingRecursion(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number + sumUsingRecursion(number - 1);
        }
    }
    public static int sumUsingLoop(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
    public static int sum(int... arr) {

        return sumWithRecursive(arr, arr.length - 1);
    }
    private static int sumWithRecursive(int[] numbers, int index) {
        if (index < 0) {
            return 0;
        }
        return numbers[index] + sumWithRecursive(numbers, index - 1);
    }
}
