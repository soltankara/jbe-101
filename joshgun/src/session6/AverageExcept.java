package session6;
/* 29 - Write a Java program to compute
the average value of an array of integers except the largest and smallest values.*/
public class AverageExcept {
    public static void main(String[] args) {
        int[] array = {4, 6, 24, 2, 40, -3, 8}; // min = -3 & max = 40 & average = 8.0

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (sum - min -max) / (array.length - 2);
        System.out.println(average);
    }
}
