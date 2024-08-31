package Session7.ArrayPractice;

public class ArrayPracticeQuestion2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("------------------------");
        int sum = 0;
        for (int container : arr) {
            sum += container;
        }
        System.out.println("The sum of elements is : " + sum);

    }
}
