package session5;

import java.util.Scanner;

public class problem18 {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        int k=1;

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <=i ; j++)
                System.out.print(k++ + " ");
                System.out.println("");
        }
    }
}
