package Session7.ArrayPractice;

public class ArrayPracticeQuestion3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[arr.length - 1 - i] = arr[i];
        }
        for (int container : arr) {
            System.out.print(container + " ");
        }
        System.out.println();
        System.out.println("--------------------");
        for (int container : reversedArr) {
            System.out.print(container + " ");
        }
    }


}
