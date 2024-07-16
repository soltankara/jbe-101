package session7;

public class Arrays22 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int value = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    System.out.print(arr[i] + " " + arr[j]);
                }
            }
            System.out.println();
        }

    }
}
