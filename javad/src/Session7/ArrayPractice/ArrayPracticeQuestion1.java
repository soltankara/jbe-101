package Session7.ArrayPractice;

public class ArrayPracticeQuestion1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is : " + max);
    }
}
