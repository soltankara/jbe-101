package session6;

/* 35 - Write a Java program to find the sum of the
two elements of a given array equal to a given integer.*/
public class SumIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};
        int targetsum = 6;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetsum) {
                    System.out.println(i + " and " + j);
                }
            }
        }
    }
}
