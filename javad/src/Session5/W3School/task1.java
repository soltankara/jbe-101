package Session5.W3School;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.print("Enter number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number<0){
            System.out.println(number+" is negative");
        }
        else if(number==0){
            System.out.println(number+ " is zero");
        }
        else {
            System.out.println(number+" is positive");
        }
    }
}
