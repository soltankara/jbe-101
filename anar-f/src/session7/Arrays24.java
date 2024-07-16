package session7;

public class Arrays24 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6,7,8,9};
        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            S += arr[i];
        }
        int totalSum = ((arr.length + 1) * (arr.length + 2)) / 2;
        int missing = totalSum - S;
        System.out.println(missing);
    }
}
