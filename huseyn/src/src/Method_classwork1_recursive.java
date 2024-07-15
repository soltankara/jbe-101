package src;

public class Method_classwork1_recursive {

    public static void main(String[] args) {
        System.out.println(sum(2, 4, 6)); // Output: 6
        System.out.println(sum(2, 4, 6, 10)); // Output: 15
        System.out.println(sum(2, 4, 6, 10, 20)); // Output: 150
    }

    public static int sum(int... numbers) {
        return sumRecursive(numbers, 0);
    }

    private static int sumRecursive(int[] numbers, int index) {
        if (index >= numbers.length) {
            return 0;
        }
        return numbers[index] + sumRecursive(numbers, index + 1);
    }
}
