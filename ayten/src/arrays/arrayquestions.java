package arrays;

import java.util.Scanner;

public class arrayquestions {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
     //7. Write a Java program to remove a specific element from an array.
//        int [] arr={2,4,9,12,6,8};
//        int index=scanner.nextInt();
//        for(int i=0;i<arr.length;i++){
//            if(i!=index) System.out.print(arr[i]+" ");
 //   }
    //QUESTION 12. Write a Java program to find duplicate values in an array of integer values.
//        int [] arr={3,6,,9,1,3,6,12,0,12};
//        for(int i=0;i<arr.length;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if(arr[i]==arr[j]) {
//                    System.out.println(arr[i]);
//                    break;
//                }
//            }
//        }

        //Question 14
       String[] arr={"aynur","ayan","aysu","gunel"};
       String[] arr2={"atilla","khayal","aynur","nergiz"};
       for(int i=0;i<arr.length;i++){
           for (int j=0;j< arr2.length;j++){
               if(arr[i]==arr2[j]) System.out.println(arr[i]);
           }
       }

    }
}
