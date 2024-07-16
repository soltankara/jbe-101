package session6;
// 15 - Write a Java program to find common elements between two integer arrays.
public class Common {
    public static void main(String[] args) {
        int[] array1 = {3, 4, 1, 28, 19, 10, 27};
        int[] array2 = {7, 4, 19, 10, 23, 18, 49};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) System.out.println(array2[j]);
            }
        }
    }
}
