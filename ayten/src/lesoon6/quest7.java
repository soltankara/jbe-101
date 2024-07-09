package lesoon6;

import java.util.Scanner;

public class quest7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=num;j>i;j--){
                System.out.print(" ");
            }for(int k=0;k<i;k++) System.out.print(i+" ");
            System.out.println();
        }
    }
}
