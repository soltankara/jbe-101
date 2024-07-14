package session7;

public class Arrays26 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,0,3,4,0,9,0,0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                i++;
                count++;
            }
            System.out.print(arr[i] + " ");

        }
        for (int j = 0; j < count; j++) {
            System.out.print(0 + " ");
        }
    }
}
