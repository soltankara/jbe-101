import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {
        // 1. Write a Java program to sort a numeric array and a string array.

        int[] numArray = {
                5, 7, 9, 2, 1
        };

        String[] strArray = {
                "Besiktas",
                "Galatasaray",
                "Fenerbahce"
        };


        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));


        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));
    }
}