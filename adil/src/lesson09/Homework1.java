package lesson09;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println(sum(1, 3, 5, 5, 6));
    }

    public static int sum(int... numbers) {
        if (numbers.length == 1) return numbers[0];
        int[] arr = Arrays.copyOfRange(numbers, 1, numbers.length);
        return numbers[0] + sum(arr);
    }
}
