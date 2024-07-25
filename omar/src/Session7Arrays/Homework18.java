package Session7Arrays;

public class Homework18 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 5, 65, 77, 29, 54};
        int specific = 65;
        int specific2 = 77;
        boolean condition = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == specific && arr[i] == specific2) {
                System.out.println(condition);
            }
        }
        // tapammadim :////
    }
}
