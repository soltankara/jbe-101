package session6;

// 8 - Write a Java program to copy an array by iterating the array.
public class Copy {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 9, 10};
        int[] copied = new int[7];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        for (int num : copied) System.out.print(num + " ");
    }
}
