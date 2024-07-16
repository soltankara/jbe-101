package session7;

public class Arrays18 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,8,6,7,9,5};
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            }
            else if (arr[i] < min2 && arr[i] != min) {
                min2 = arr[i];
            }
        }
        System.out.println(min2);
    }
}
