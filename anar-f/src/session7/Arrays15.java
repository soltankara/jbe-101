package session7;

public class Arrays15 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr2 = {0, 2, 3, 11, 12, 13, 7, 23, 98};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.println("Common element is: "  + arr[i]);
                }
            }
        }
    }
}
