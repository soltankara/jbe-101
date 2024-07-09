package Exercises;

import java.util.Scanner;
public class ElshanEx17 {
    public static void main(String[] args) {
//17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

        for (int i = 1, j =1 ; i <= 4;i++,j = (j*10)+1){
            System.out.println(i*j);
        }
    }
}


