package session6;

// 10 - Write a Java program to find the maximum and minimum value of an array.
public class Minmax {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 7, 10, 11};
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
