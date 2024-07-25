package Session7Arrays;

public class Homework17 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 7, 8, 6, 4, 3, 5, 6, 7};
        int sum = 0;
        boolean condition = true;
        for (int i = 0; i <= 10; i++) {
            sum += arr[i];
        }
        if (sum == 30) {
            System.out.println(condition);
        } else {
            condition = false;
            System.out.println(condition);
        }
    }
}
