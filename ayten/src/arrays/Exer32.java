package arrays;

import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] arr=new int []{62,75,65,75,65,75};
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        System.out.println(isNum1orNUM2(arr,num1,num2));
    }
    public static boolean isNum1orNUM2(int [] arr,int num1,int num2) {
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num1 && arr[i] != num2){
                flag= false;
                break;
            }
        }
        if(flag==false)  return false;
        return true;
    }

}
