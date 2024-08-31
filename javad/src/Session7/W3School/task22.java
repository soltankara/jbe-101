package Session7.W3School;

import java.util.Scanner;

public class task22 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter specified number : ");
        int specifiedNumber = sc.nextInt();
        int [] arr = {4,21,5,3,-5,2,1,6,8,3,5,0};
        for (int i = 0;i< arr.length-1;i++){
            for (int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==specifiedNumber){
                    System.out.println(arr[i]+"+"+arr[j]+"= "+specifiedNumber);
                }
            }
        }
    }
}
