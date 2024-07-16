package session7;

public class Arrays16 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr2 = {0, 2, 3, 11, 12, 13, 7, 23, 98};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    i++;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr2.length; l++) {
                if (arr[k] == arr2[l]) {
                    k++;
                }
            }
            System.out.print(arr2[k] + " ");
        }
    }
}
