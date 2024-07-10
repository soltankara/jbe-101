package session6;

import java.util.Scanner;

// 4 - Write a Java program to calculate the average value of array elements.
public class average {
    public static void main(String[] args){
//        int[] array = {2, 4, 6, 8, 10};
//        int sum=0;
//        for(int num: array){
//            sum+=num;
//        }
//        double average = sum/array.length;
//        System.out.println(average);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= scanner.nextInt();
        int[] array = new int[num];
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            array[i]= scanner.nextInt();
            sum+=array[i];
        }
        double average = sum/ array.length;
        System.out.println(average);
    }
}
