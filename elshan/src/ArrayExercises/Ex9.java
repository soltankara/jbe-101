package ArrayExercises;

import java.util.Arrays;

public class Ex9 {
    public static void main(String[] args) {
        // 9. Write a Java program to insert an element (specific position) into an array.
        int[] arr1 = {2, 3, 1, 5, 8};
        int[] arr2 = new int[arr1.length + 1];
        int index = 1;
        int value = 9;
        for (int i = 0,j = 0; i < arr1.length; i++,j++ ){
            if(index == j){
                arr2[j++] = value;
            }
            arr2[j] = arr1[i];
        }


        System.out.println(Arrays.toString(arr2));
    }
}
