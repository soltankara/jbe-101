package session7;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        //5. Write a Java program to test if an array contains a specific value.
        int[] arr = new int[]{1, 5, 3, 8, 2, 9};
        int numberToSearch = 7;
        //1)
        boolean b = Arrays.stream(arr).anyMatch((int n) -> n == numberToSearch);
        System.out.println(b ? ("array contains " + numberToSearch) : ("array does not contain " + numberToSearch));
        //2)
        boolean exists = false;
        for (int i : arr) {
            if (i == numberToSearch) {
                exists = true;
                break;
            }
        }
        System.out.println(exists ? ("array contains " + numberToSearch) : ("array does not contain " + numberToSearch));
    }
}
