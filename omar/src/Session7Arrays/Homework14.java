package Session7Arrays;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 8, 9, 4, 3, 5, 6, 7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] < arr[i]) {
                System.out.println("Second smallest element is: " + arr[i]);
                break;
            }
        }
    }
}
