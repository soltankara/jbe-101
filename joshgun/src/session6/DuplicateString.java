package session6;
// 13 - Write a Java program to find duplicate values in an array of string values.
public class DuplicateString {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "A", "E", "B"};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) System.out.println(array[j]);
            }
        }
    }
}
