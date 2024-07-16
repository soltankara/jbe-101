package session6;

// 11 - Write a Java program to reverse an array of integer values.
public class Reverse {
    public static void main(String[] main) {
        int[] array = {3, 4, 9, 1, 7, 5, 10, 12};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
