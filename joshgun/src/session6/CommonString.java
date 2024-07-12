package session6;

// 14 - Write a Java program to find common elements between two arrays (string values).
public class CommonString {
    public static void main(String[] args) {
        String[] array1 = {"a", "c", "h", "e", "d", "f"};
        String[] array2 = {"c", "h", "k", "l", "m", "n", "b", "d"};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) System.out.println(array2[j]);
            }
        }
    }
}
