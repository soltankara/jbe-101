package session6;
// 20 - Write a Java program to convert an array to an ArrayList.
import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoList {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 1, 2, 1, 45};
        ArrayList<Integer> list = new ArrayList(Arrays.asList(array));
        System.out.println(list);
    }
}
