package session8;

import java.util.Arrays;

public class Classwork1 {
    public static void main(String[] args) {

        System.out.println(sum(2, 4, 6, 8, 10));
    }

    public static int sum(int... numbers) {

        if (numbers.length == 1) return numbers[0];

        int[] array = Arrays.copyOfRange(numbers, 1, numbers.length);
        return numbers[0] + sum(array);
    }
}

