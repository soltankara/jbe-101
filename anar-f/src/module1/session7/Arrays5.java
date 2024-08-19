package module1.session7;

public class Arrays5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3, 5, 7, 9};
        int value = 5;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("The value is " + arr[i]);
            } else System.out.println("The value is not " + arr[i]);
        }

    }
}
