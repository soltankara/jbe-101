package module1.session7;

public class Arrays17 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 2, 4, 5, 6};
        int max = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] > max2 && arr[i] < max) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
