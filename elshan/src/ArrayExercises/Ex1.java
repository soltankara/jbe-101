package ArrayExercises;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
//        1. Write a Java program to sort a numeric array and a string array.

        int[] numeric = {1, 6, 2, 9, 3};
        String[] stringArr = {"Java","Python","C#","C++"};

        Arrays.sort(numeric);

        System.out.println("Sorted numeric array: " +Arrays.toString(numeric));

        Arrays.sort(stringArr);

        System.out.println("Sorted string array: "+ Arrays.toString(stringArr));






    }
}