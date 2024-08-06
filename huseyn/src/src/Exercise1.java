package src;

import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {
        // 1. Write a Java program to sort a numeric array and a string array.

        int[] num_array = {
                5, 7, 9, 2, 1
        };

        String[] str_array = {
                "Besiktas",
                "Galatasaray",
                "Fenerbahce"
        };


        Arrays.sort(num_array);
        System.out.println(Arrays.toString(num_array));


        Arrays.sort(str_array);
        System.out.println(Arrays.toString(str_array));
    }
}