package Session7Arrays;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Homework16 {
    public static void main(String[] args) {
        // difference between largest and smallest
        int[] arr = {9, 7, 6, 5, 7, 8, 5, 4, 9, 7, 0, 7, 6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int difference = abs(arr[0] - arr[arr.length - 1]);
        System.out.println("difference = " + difference);
    }
}
