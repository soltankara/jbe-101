package module1.session7;

public class Arrays6 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 2, 9};
        int index = 0;
        int value = 6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
            }
        }
        System.out.println(index);
    }
}
