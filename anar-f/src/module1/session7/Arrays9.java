package module1.session7;

import java.util.Arrays;

public class Arrays9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Arrays.fill(arr, 4, 5, 2);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
