package Session5.W3School;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,sum=0;
        double average;

        for(int i = 0;i<5;i++){
            System.out.print("Enter "+(i+1)+". number : ");
            number = sc.nextInt();
            sum+=number;
        }
        System.out.println("------------------------------");
        average = (double) sum /5;
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+average);

    }
}
