package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Exer20 {
    public static void main(String[] args) {
        //question20. Write a Java program to convert an array to an ArrayList.
        String[] arr = new String[]{"JAVA", "Sql", "PHP", "C", "C#", "DSA", "C++"};
        ArrayList arrlist = new ArrayList(Arrays.asList(arr));
        System.out.println(arrlist);
    }
}

