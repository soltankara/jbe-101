package arrays;

public class Ex26 {
    public static void main(String[] args) {
        int [] arr=new int[]{1,0,4,0,2,8,3,0,1,7,0,12,0,8,23};
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) System.out.print(arr[i]+" ");
            else k++;
        }
        for (int j=0;j<k;j++) System.out.print(0 +" ");
    }
}
