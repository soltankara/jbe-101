package arrays;

import java.util.Scanner;

public class Exer24 {
    //Q24. Write a Java program to find a missing number in an array.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []arr= new int []{2,3,4,6,7,8};
        int min=arr[0];
        int max=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min =arr[i];
        }
      int sumWithMissing = 0;
        for (int i = min; i <= max; i++) {
                  sumWithMissing += i;
        }
        System.out.println(sumWithMissing-sum);
    }
}
