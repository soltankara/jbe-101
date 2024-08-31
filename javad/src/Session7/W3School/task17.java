package Session7.W3School;

public class task17 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 6, 43, -87, 1, 0};
        for (int container : arr) {
            System.out.print(container + " ");
        }
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("-----------------------------");
        for (int container : arr) {
            System.out.print(container + " ");
        }
        System.out.println();
        System.out.println("-----------------------------");
        System.out.println("Second largest element is : " + arr[arr.length - 2]);
    }
}
