package Session7Arrays;

public class Homework12 {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 4, 5, 3, 3, 6, 7, 9, 6, 6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Duplicate element is:" + arr[i]);

            }


        }

        System.out.println("there is not a duplicate element");

    }
}
