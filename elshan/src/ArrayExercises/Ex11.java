package ArrayExercises;

import java.util.Arrays;

public class Ex11 {
    public static void main(String[] args) {
        //11. Write a Java program to reverse an array of integer values.
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        int tmp = 0;
        for (int i = 0; i < values.length/2; i++) {
            tmp = values[i];
            values[i] = values[values.length - i - 1];
            values[values.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(values));

    }
}
