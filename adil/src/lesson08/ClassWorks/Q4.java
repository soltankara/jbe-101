package lesson08;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 5};
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        int sec = arr[0];
        for (int i : arr) {
            if (i > sec && i != max) sec = i;
        }
        System.out.println(sec);
    }
}
