package session6;

// 16 - Write a Java program to remove duplicate elements from an array.
// THere is a problem while printing the last number
public class RemoveDup {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 2, 3, 6, 9, 19};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    i++;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}
