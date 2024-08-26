package src;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise20 {
    public static void main(String[] args) {
        //20. Write a Java program to convert an array to an ArrayList.
        String[] arr = new String[] {"Messi", "Ronaldo", "Ronaldinho", "Maradona"};

        ArrayList list = new ArrayList(Arrays.asList(arr));
        System.out.println(list);
    }
}
