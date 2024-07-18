package az.perfect.session7.homework2;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {25, 63, 47, 58, 16, 74};
        System.out.println("Enter the new element:");
        int number=sc.nextInt();
        int[] newarray= new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            newarray[i]=arr[i];
        }

        newarray[arr.length]=number;
        System.out.println("New Array: ");
        for (int i = 0; i < newarray.length ; i++) {
            System.out.print(newarray[i]+" ");
        }



    }
}
