package session7;

public class Arrays25 {
    public static void main(String[] args) {
        int [] arr = {2,3,5,7,8};
        int [] arr2 = {1,2,6,7,8,9};
        int [] arr3 = {1,2,4,7,10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr[i] == arr2[j] && arr[i] == arr3[k]) {
                        System.out.println(arr[i]);
                    }
                }
            }
        }
    }
}
