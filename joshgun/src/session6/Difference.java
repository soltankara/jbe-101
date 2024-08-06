package session6;
/* 28 - Write a Java program to get the difference between the largest and smallest
 values in an array of integers. The array must have a length of at least 1.*/
public class Difference {
    public static void main(String[] args) {
        int[] array = {4, 6, 24, 2, 40, -3, 8};

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
        System.out.println("The difference is: " + (max - min));
    }
}
