package module1.session7;

public class Arrays28 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 5};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max + min);
    }
}
