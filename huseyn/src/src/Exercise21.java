package src;

import java.util.ArrayList;

public class Exercise21 {
    public static void main(String[] args) {
        //21. Write a Java program to convert an ArrayList to an array.
        ArrayList<String> list = new ArrayList<String>();

        list.add("Huseyn");
        list.add("Ahmad");
        list.add("Ali");
        list.add("Akbar");
        list.add("Vali");
        list.add("Vugar");

        String[] arr = new String[list.size()];

        list.toArray(arr);
        for (String string : arr) {
            System.out.println(string);
        }
    }
}