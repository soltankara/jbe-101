package session8;

public class Homework2 {
    public static void main(String... args) {
        System.out.println(sum(1, 2));
    }

    public static int sum(int... numbers) {
        return sumRecursive(numbers, numbers.length - 1);
    }

    public static int sumRecursive(int[] numbers, int index) {
        if (index < 0) {
            return 0;
        }
        return numbers[index] + sumRecursive(numbers, index - 1);
    }
}