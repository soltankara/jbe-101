package Session7Arrays;

public class Homework15 {
    public static void main(String[] args) {
        // Write a java program that checks equality of 2 arrays
        int[] arr = {2, 3, 5, 6, 2, 5, 6, 4, 3};
        int[] arr2 = {4, 6, 7, 3, 7, 2, 6, 7, 5};
        boolean equality = true;
        if (arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    equality = false;
                }

            }
        } else {
            equality = false;
        }
        if (equality) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
