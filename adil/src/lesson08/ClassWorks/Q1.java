package lesson08;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 5};
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        System.out.println(max);
    }

}
