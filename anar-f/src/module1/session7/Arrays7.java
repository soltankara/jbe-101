package module1.session7;

public class Arrays7 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int value = 3;
        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    i++;
                }
            System.out.print(arr[i] + " ");
        }
    }
}
