package Session5.W3School;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        System.out.println("---------------------");
        int temp=1;
        for(int i = 1;i<=size;i++){
            for(int j = 1 ;j<=i;j++){
                System.out.print((temp++)+" ");

            }

            System.out.println();
        }
    }
}
