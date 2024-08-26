package metods;

import java.util.Arrays;

public class IsEven {
    public static void main(String[] args) {

        System.out.println(sum(5, 2, 6, 8, 9, 3, 3, 7));
    }

    //    static boolean isEven(int number){
//        return number%2==0 ? true : false;
//    }
//    static int min(int num1,int num2,int num3){
//        return Math.min(num3,Math.min(num1,num2));
//    }
//    static  String reverseme(String s){
//        String reversede="";
//        for(int i=s.toCharArray().length-1;i>0;i--){
//            reversede+=s.charAt(i);
//        }
//        return reversede;
//    }
//    static int sum(int...arr){
//        int sum=0;
//        for (int i : arr) {
//            sum+=i;
//        }
//return sum;
//    }
    public static int sum(int... arr) {
        if (arr.length == 0) return 0;
        int[] arrnew = Arrays.copyOfRange(arr, 1, arr.length);
        return arr[0] + sum(arrnew);
    }


}
