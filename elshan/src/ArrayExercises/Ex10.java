package ArrayExercises;

public class Ex10 {
    public static void main(String[] args) {
        // 10. Write a Java program to find the maximum and minimum value of an array.
        int[] arr = {2, 1, 5, 3, 7, 4};
        int max = arr[1];
        int min = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max){
                max = arr[i];
            }
            if (arr[i] <= min){
                min = arr[i];
            }
        }
        System.out.println("max value of array: " +max);
        System.out.println("min value of array: " +min);
    }
}
