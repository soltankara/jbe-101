package session6;

import java.util.ArrayList;

// 21 - Write a Java program to convert an ArrayList to an array.
public class ListtoArray {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(10);

        int[] array = new int[list.size()];
        Object[] converted = list.toArray();

        for (int i = 0; i < converted.length; i++) {
            System.out.println(converted[i]);
        }
    }
}
