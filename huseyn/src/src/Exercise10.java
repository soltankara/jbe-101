package src;

public class Exercise10 {

    public static int Max(int[] arr) {
        //10. Write a Java program to find the maximum and minimum value of an array.
        int max = arr[0];


        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int Min(int[] arr) {

        int min = arr[0];


        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 9, 4};


        int maxValue = Max(array);
        int minValue = Min(array);


        System.out.println("Max: " + maxValue);
        System.out.println("Min: " + minValue);
    }
}
