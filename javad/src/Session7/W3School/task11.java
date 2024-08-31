package Session7.W3School;

public class task11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.print("Original arr -> ");
        for (int container : arr) {
            System.out.print(container + " ");
        }
        System.out.println("\n--------------------");
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.print("new arr -> ");
        for (int container : arr) {
            System.out.print(container + " ");
        }
    }
}
