package Session7.W3School;

public class task8 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 8, 1, 0};
        int[] newArr = new int[arr.length];
        System.out.print("original array -> ");
        for (int container : arr) {
            System.out.print(container + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println("\n-----------------------------------------");
        System.out.print("copied array -> ");
        for (int container : newArr) {
            System.out.print(container + " ");
        }

    }
}
