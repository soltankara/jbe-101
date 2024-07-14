package session7;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int [] arr = {1, 9, 7, 3, 5, 13, 11, 12};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        String [] arr2 = {"a", "c", "b", "f", "d", "e"};
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
