package Classworks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysInClass {
    public static void main(String[] args) {
        int [] numbers = new int [10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }

        Arrays.sort(numbers);
        ArrayList list = new ArrayList();

    }

}
