package session6;

// 12 - Write a Java program to find duplicate values in an array of integer values.
public class Duplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 3, 7, 9, 19, 7, 13};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) System.out.println(array[j]);
            }
        }
    }
}
