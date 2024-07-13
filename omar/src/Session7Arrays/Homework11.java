package Session7Arrays;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        int[] arr = {3, 6, 7, 9, 4, 2, 6, 8, 5, 8, 3};
        int[] arrReverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrReverse[i] = arr[arr.length - 1 - i];
        }
        System.out.print(Arrays.toString(arrReverse));
    }
}
